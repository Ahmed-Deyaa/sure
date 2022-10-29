import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.IOException;

public class Test1 {
    @Test(enabled = false, groups = {"Anime"},priority = 1)
    public void tst1(){
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("Senpai");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
    }

    @Test(enabled = false, groups = {"Manga"},priority = 1)
    public void tst2(){
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("Oni Chan");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
    }
    @Test(enabled = true)
    public void openChrome() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(System.getProperty("link"));
        driver.quit();
    }

    @Test
    public void print() throws IOException {
        System.out.println("Username: "+System.getProperty("username"));
        System.out.println("Password: "+System.getProperty("password"));
    }

}
