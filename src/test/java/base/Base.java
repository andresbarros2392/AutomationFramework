package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Base {

    public static WebDriver driver; //Declared as static to just have one instance of it.
    public static Properties properties; // Declared Properties variable
    /**
     * method to return Webdriver
     *
     * @return WebDriver instance
     */
    public static WebDriver getDriver() throws IOException {
        properties = new Properties();
        FileInputStream fileInput = new FileInputStream("/Users/andresbarros/MavenProject/src/test/java/base/global.properties");
        properties.load(fileInput);
        System.setProperty("webdriver.chrome.driver", "/Users/andresbarros/chromedriv/chromedriver");
        driver = new ChromeDriver();
        driver.get(properties.getProperty("baseUrl"));
        driver.manage().window().maximize();
        return driver;
    }

}
