package com.testvagrant.api.utilities;

import java.nio.file.Files;
import java.nio.file.Paths;

import org.apache.juneau.json.JsonParser;
import org.apache.juneau.parser.ParseException;

public class JsonUtils {

	/**
	 * This method accepts a file path as string. Read file content
	 * 
	 * @param file
	 * @return the given file content an a String
	 * @throws Exception
	 */
	public static String readFileAsString(String file) throws Exception {
		return new String(Files.readAllBytes(Paths.get(file)));
	}

	/**
	 * This method accepts json as a string and a pojo class. Deserialize the json
	 * back to it's pojo representation
	 * 
	 * @param <T>
	 * @param inputJsonAsString
	 * @param classReference
	 * @return POJO of given json content
	 * @throws ParseException
	 */
	public static <T> T deSerializeJson(String inputJsonAsString, Class<T> classReference) throws ParseException {
		JsonParser jsonParserRef = JsonParser.DEFAULT;
		return jsonParserRef.parse(inputJsonAsString, classReference);
	}

}
