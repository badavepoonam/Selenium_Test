import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class VerifyPage {

    public WebDriver driver;
    @BeforeTest
    public void LaunchBrowser() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Poonam\\IdeaProjects\\Coding_Test\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.entrata.com/");
        driver.manage().window().maximize();
    }

    //Verify user is able to launch wesite & verify title
    @Test
    public void verifyPageTitle() {

        driver.findElement(By.className("cookie-accept-button")).click();
        String expectedTitle = "Property Management Software | Entrata";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    //verify user is able to navigate Sign In page
    @Test
    public void VerifySignIn() {
        driver.findElement(By.className("outline-dark-button")).click();
//        driver.findElement(By.className("cta-link-default")).click();
        String expectedTitle = "Entrata Sign In";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    //Verify user is able to redirect ResidentLogin functionality
    @Test
    public void ResidentLogin() {
        driver.findElement(By.xpath("//a[text()='Resident Login']")).click();
        String expectedTitle = "Welcome to Resident Portal";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);

    }

}
