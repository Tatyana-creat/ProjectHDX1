package com.hematogenix.step_definitions;

import com.hematogenix.utility.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @BeforeMethod
    public void setup(){
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.getDriver().manage().window().maximize();




    }
    @AfterMethod
    public void teardown(Scenario scenario){
        //I want to take a screenshot when current scenario fails
        //scenario.isFailed ()---tells if scenario failed or not
        if (scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
           // scenario.embed(screenshot,"image/png");
        }

    }


}
