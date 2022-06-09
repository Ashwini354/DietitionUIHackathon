package com.nn.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesConfiguration {

	public static Properties loadProperties() {
		
		try {
			String projectPath=System.getProperty("user.dir");
			System.out.println("------"+projectPath);
			FileInputStream input = new FileInputStream(
					projectPath+"/src/test/resources/application.properties");
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
