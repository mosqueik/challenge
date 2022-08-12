package steps.def;

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import java.util.Properties;

public class BaseTest {

    public static final String QA = "qa";
    public static final String PRODUCTION = "prod";

    public static Properties properties = new Properties();
    public static String environment = null;

    BaseTest() {
        ClassLoader classLoader = getClass().getClassLoader();
        try (InputStream inputStream = Objects.requireNonNull(classLoader.getResource("endpoints.config.properties")).openStream()) {
            if (inputStream != null) {
                properties.load(inputStream);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected String getBaseUrl() {
        return properties.get("endpoints.config." + environment + ".apiUrl").toString();
    }

    /***
     * SET ENVIRONMENT
     */
    public static void setEnvironment(String env) {
        switch (env.toLowerCase()) {
            case "qa":
                environment = QA;
                break;
            case "prod":
                environment = PRODUCTION;
                break;
        }
    }

}
