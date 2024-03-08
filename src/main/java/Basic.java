package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Basic {

    protected static WebDriver driver;
    public static  void LaunchBrowser()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Poonam\\IdeaProjects\\Coding_Test\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.entrata.com/");
        driver.manage().window().maximize();
    }

}
