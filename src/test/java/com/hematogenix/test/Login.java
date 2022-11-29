package com.hematogenix.test;

import com.hematogenix.utility.BrowserUtils;
import com.hematogenix.utility.ConfigurationReader;
import com.hematogenix.utility.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Login  extends BrowserUtils{
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //go to login page
        driver.get(ConfigurationReader.getProperty("url"));
    }

    @AfterMethod
    public void tearDown(){
        BrowserUtils.sleep(10);
        driver.close();
    }

    @Test
    public void login_with_with_login_btn(){
        //write username
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys(ConfigurationReader.getProperty("username"));

        //write password
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys(ConfigurationReader.getProperty("password"));

        //click acknowledgeIcon
        WebElement acknowledgeIcon = driver.findElement(By.id("chk-hdx-disclaimer"));
        BrowserUtils.sleep(5);
        acknowledgeIcon.click();

        //click SignInButton
        WebElement SignInButton = driver.findElement(By.id("btn-login-submit"));
        BrowserUtils.sleep(5);
        SignInButton.click();




    }
}
