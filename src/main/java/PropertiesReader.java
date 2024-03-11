import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {

    public static void main(String[] args) {

        Properties prop = new Properties();
        try {
        FileInputStream in = new FileInputStream("./src/main/resources/config.properties");
            prop.load(in);

        }catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(prop.get("name"));

    }
}
