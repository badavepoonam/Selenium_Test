package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class VerifyPage extends Basic {

    @Test
    public void verifyPageTitle()
    {
       Basic.LaunchBrowser();
       driver.findElement(By.id("rcc-confirm-button")).click();
        String expectedTitle = "Propery Management Software";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }
}
