import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VerifyWatchDemo {

    public WebDriver driver;

    @BeforeTest
    public void LaunchBrowser() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Poonam\\IdeaProjects\\Coding_Test\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.entrata.com/");
        driver.manage().window().maximize();
    }

    //Verify user is able to launch website & page title
    @Test
    public void verifyPageTitle() {

        driver.findElement(By.className("cookie-accept-button")).click();
        String expectedTitle = "Property Management Software | Entrata";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    //verify user is able to navigate watch demo page
    @Test
    public void clickOnwatchDemo() {
        driver.findElement(By.className("header-desktop-buttons")).click();
        String expectedTitle = "Property Management Software | Entrata";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    //verify user is able to add the details in resective textfields
    @Test
    public void AddDetails() {
        driver.findElement(By.id("FirstName")).sendKeys("Test");
        driver.findElement(By.id("LastName")).sendKeys("User");
        driver.findElement(By.id("Email")).sendKeys("abc@entrata.com");
        driver.findElement(By.id("Company")).sendKeys("entrata");
        driver.findElement(By.id("Phone")).sendKeys("1234567891");
        Select drpCountry = new Select(driver.findElement(By.id("Unit_Count__c")));
        drpCountry.selectByVisibleText("1-10");
        driver.findElement(By.id("Title")).sendKeys("Software Engineer");
        Select name = new Select(driver.findElement(By.id("demoRequest")));
        name.selectByVisibleText("Resident");

    }

}
