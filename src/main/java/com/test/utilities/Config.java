package com.test.utilities;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config {

    private static final Properties prop = new Properties();
    private static final Logger logger= LoggerFactory.getLogger(Config.class);

    public static void loadConfigPropertyFile() {
        FileInputStream fis = null;
        try {
            String userPath=System.getProperty("user.dir");
            fis = new FileInputStream(userPath+"/src/test/resources/properties/config.properties");
            prop.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static String getConfigProperty(String propName) {

        if (prop.isEmpty()) {
            loadConfigPropertyFile();
        }
        return prop.getProperty(propName);
    }

}
