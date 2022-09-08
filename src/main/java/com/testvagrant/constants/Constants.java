package com.testvagrant.constants;

/**
 * This constants interface holds the constant values used across the project
 * 
 * @author magesh.nagamani
 *
 */
public interface Constants {

	/**
	 * This constants interface holds the constant values that are required to read
	 * configuration property files
	 * 
	 * @author magesh.nagamani
	 *
	 */
	public interface ConfigConstants {
		String TEST_RESOURCES_BASE_PATH = "src/test/resources/";
		String CONFIGURATION_PROPERTIES_FILE_PATH = TEST_RESOURCES_BASE_PATH + "config.properties";
	}
}
