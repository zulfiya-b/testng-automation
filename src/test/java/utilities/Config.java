package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config {

    // Implement this utility class which can setup the properties file and return the value for the given key
    // in that file
/*
    public static Properties readProp () throws IOException {
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream("src/test/resources/configurations.properties");
        properties.load(fileInputStream);
        return properties;
    }

*/

    private static Properties properties;
    static {
        try {

        properties = new Properties();
        FileInputStream file = new FileInputStream("src/test/resources/configurations.properties");
        properties.load(file);

    }
        catch (IOException e){
            System.out.println("File not found");
        }
    }

    public static String getValue (String key) {
        return properties.getProperty(key);
    }





}
