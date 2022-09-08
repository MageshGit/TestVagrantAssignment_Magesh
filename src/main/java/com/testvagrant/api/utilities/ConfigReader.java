package com.testvagrant.api.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.testvagrant.constants.Constants;

/**
 * This class has methods to read and return values from property files
 * 
 * @author magesh.nagamani
 *
 */
public class ConfigReader {
	static Properties prop = null;

	/**
	 * This method creates an instance of properties and loads the mentioned file
	 * 
	 * @return an instance of properties
	 */
	private static Properties getConfigReader() {

		if (prop == null)
			try (InputStream input = new FileInputStream(
					Constants.ConfigConstants.CONFIGURATION_PROPERTIES_FILE_PATH)) {

				prop = new Properties();

				// load a properties file
				prop.load(input);

			} catch (IOException ex) {
				ex.printStackTrace();
			}
		return prop;
	}

	/**
	 * Returns the value of the given key from the property file
	 * 
	 * @param propertyName
	 * @return
	 */
	public static String getValueFromPropertiesFile(String propertyName) {
		String valueToReturn = null;

		try {
			valueToReturn = getConfigReader().getProperty(propertyName).trim();
		} catch (Exception e) {

		}
		return valueToReturn;
	}
}
