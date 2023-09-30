import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfigFile {
    Properties properties;
    String path = "C:\\Users\\sakib\\Downloads\\HTML\\src\\Config.properties";

    ReadConfigFile() {
        properties = new Properties();
        try {
            FileInputStream fis = new FileInputStream(path);
            properties.load(fis);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String getUrl() {
        String url = properties.getProperty("url");
        if (url != null) {
            return url;
        } else {
            throw new RuntimeException("bad url");
        }
    }

    public String getUsername() {
        String username = properties.getProperty("username");
        if (username != null) {
            return username;
        } else {
            throw new RuntimeException("bad username");
        }
    }


    public String getPassword() {
        String password = properties.getProperty("password");
        if (password != null) {
            return password;
        } else {
            throw new RuntimeException("bad password");
        }
    }
}
