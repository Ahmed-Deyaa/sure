import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Properties;

public class TestVariables {

    @Test(enabled = true)
    public void openChrome() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(setVariables().getProperty("url"));
        driver.quit();
    }

    @Test
    public void print() throws IOException {
        System.out.println("Username: "+setVariables().getProperty("username"));
        System.out.println("Password: "+setVariables().getProperty("password"));
    }

    public Properties setVariables() throws IOException {
        Properties properties = new Properties();
        properties.load(TestVariables.class.getClassLoader().getResourceAsStream("project.properties"));
        return properties;
    }
}
