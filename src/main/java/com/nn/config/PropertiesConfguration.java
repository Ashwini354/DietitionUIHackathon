package com.nn.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesConfguration {

	public static Properties loadProperties() {
		try {
			FileInputStream input = new FileInputStream(
					"/Users/ashwiniramamurthy/eclipse-workspace/DietitionCumcumber/src/test/resources/application.properties");
			Properties prop = new Properties();
			// load a properties file
			prop.load(input);
			return prop;
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return null;
	}

}
