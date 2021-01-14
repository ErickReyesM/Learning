package utilities;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesReader {
    InputStream inputStream;
    Properties prop;

    public Properties getPropValues(String fileName)  {

        try {
            prop = new Properties();
            String propFileName = fileName;

            inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);

            if (inputStream != null) {
                prop.load(inputStream);
            } else {
                throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
            }
            inputStream.close();

        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
        return prop;
    }
}
