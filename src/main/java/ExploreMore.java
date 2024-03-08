import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ExploreMore {

    public WebDriver driver;

    @BeforeTest
    public void LaunchBrowser() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Poonam\\IdeaProjects\\Coding_Test\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.entrata.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void NavigateToExplore()
    {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.id("link_text")).click();
        List<String> browserTabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(browserTabs.get(0));
        String expectedTitle = "Entrata Summit 2024 | The Best Week in Multifamily Sept 23-26";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

}
