package com.coffee_shop.Configurations;


import java.io.IOException;
import java.io.InputStream;
import java.io.FileInputStream;

import java.util.Properties;


public class EnvironmentVariableConfiguration {


    public Properties Environment;

    public EnvironmentVariableConfiguration() {

        try {

            String ConfigurationProperties = "./src/main/resources/config.properties";

            InputStream fileInputStream = new FileInputStream(ConfigurationProperties);
            Properties PropertiesObject = new Properties();

            // load a properties file
            PropertiesObject.load(fileInputStream);
            this.Environment = PropertiesObject;

        } catch (IOException ErrorMessage) { ErrorMessage.printStackTrace(); }

    }
    
}