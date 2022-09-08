package com.testvagrant.api.tests;

import java.util.concurrent.atomic.AtomicInteger;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.testvagrant.api.utilities.ConfigReader;
import com.testvagrant.api.utilities.JsonUtils;
import com.testvagrant.constants.Constants;
import com.testvagrant.pojo.Team;

public class TeamPlayersTest {

	private final String HOST_COUNTRY = "india";
	private final String WICKET_KEEPER = "wicket-keeper";

	private String jsonAsString = null;
	private final String JSON_FILE_PROPERTY_NAME = "rcbPlayersJsonFile";

	Team teamInfo;

	@BeforeClass
	public void getJsonAndConvertAsPOJO() throws Exception {
		String jsonFileName = ConfigReader.getValueFromPropertiesFile(JSON_FILE_PROPERTY_NAME);

		jsonAsString = JsonUtils.readFileAsString(Constants.ConfigConstants.TEST_RESOURCES_BASE_PATH + jsonFileName);

		// de-serialize the Json response
		teamInfo = JsonUtils.deSerializeJson(jsonAsString, Team.class);
	}

	@Test(priority = 0)
	public void verifyTeamHasOnlyFourForeignPlayers() {
		AtomicInteger foreignPlayerCount = new AtomicInteger(0);

		teamInfo.getPlayer().forEach(player -> {
			if (!player.getCountry().equalsIgnoreCase(HOST_COUNTRY)) {
				foreignPlayerCount.getAndIncrement();
			}
		});

		Assert.assertTrue(foreignPlayerCount.get() == 4, "The given team has " + foreignPlayerCount.get()
				+ " foreign players. The number of foreign player should be 4.");
	}

	@Test(priority = 1)
	public void verifyTeamHasAtleastOneWicketKeeper() {
		AtomicInteger wicketKeeperCount = new AtomicInteger(0);

		teamInfo.getPlayer().forEach(player -> {
			if (player.getRole().equalsIgnoreCase(WICKET_KEEPER)) {
				wicketKeeperCount.getAndIncrement();
			}
		});

		Assert.assertTrue(wicketKeeperCount.get() >= 1, "The given team has " + wicketKeeperCount.get()
				+ " wicket keepers. The number of wicket keepers should atleast 1.");
	}

}
