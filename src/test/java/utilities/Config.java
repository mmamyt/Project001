package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config {


    private static final Properties properties = new Properties();

    static {
        String path = "config.properties";
        FileInputStream file;
        {
            try {
                file = new FileInputStream(path);
                properties.load(file);
                file.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static String getProperty(String key){
        return properties.getProperty(key);
    }


}
