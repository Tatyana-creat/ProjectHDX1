package com.hematogenix.utility;

import java.io.*;
import java.util.Properties;

public class ConfigurationReader {


   public static String read;
    private static Properties properties = new Properties();

    static {
        try {


            FileInputStream file = new FileInputStream("configuration.properties");
            properties.load(file);
            file.close();

        } catch (IOException e) {
            System.out.println("File not found in the ConfigurationReader class ");
            e.printStackTrace();
        }

    }

    public static String getProperty(String keyword) {
        return properties.getProperty(keyword);
    }

    public static String read(String key) {
        return key;
    }
}

