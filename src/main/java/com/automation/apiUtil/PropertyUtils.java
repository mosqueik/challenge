package com.automation.apiUtil;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Properties;
import java.util.logging.Logger;

public class PropertyUtils {

    private static PropertyUtils instance = null;
    private final Properties properties = new Properties();
    private final List<String> filenames = Collections.singletonList("com.automation.endpoints");
    Logger logger = Logger.getLogger(this.getClass().getName());

    private PropertyUtils(){
        this.loadProperties();
        this.properties.putAll(System.getProperties());
    }

    private static PropertyUtils getInstance(){
        if (PropertyUtils.instance == null) {
            PropertyUtils.instance = new PropertyUtils();
        }
        return PropertyUtils.instance;
    }

    public static String getProperty(final String key) {
        return PropertyUtils.getInstance().properties.getProperty(key);
    }

    public void loadProperties() {
        for(String filename : filenames) {
            String filePath = "/properties/" + filename + ".properties";
            try (InputStream inputStream = this.getClass().getResourceAsStream(filePath)) {
                if (inputStream != null) {
                    this.properties.load(inputStream);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
