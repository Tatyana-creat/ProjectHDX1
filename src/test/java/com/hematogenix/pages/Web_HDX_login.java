package com.hematogenix.pages;

import com.hematogenix.utility.ConfigurationReader;
import com.hematogenix.utility.Driver;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Web_HDX_login {

   // public Web_HDX_login() {
      //   PageFactory.initElements(Driver.getDriver(), this);
      //  }


        @FindBy(xpath = "//*[@id=\"login-form\"]/div/div[2]/div/label")
        public WebElement userInput;

        @FindBy(xpath = "//*[@id=\"login-form\"]/div/div[4]/div[1]/label")
        public WebElement passwordInput;

        @FindBy(id = "chk-hdx-disclaimer")
        public WebElement acknowledgeIcon;

        @FindBy(id = "btn-login-submit")
        public WebElement SignInButton;



    public Web_HDX_login() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void togo(){
        Driver.getDriver().get("https://hdx-test.hematogenix.com/Home/Login");
    }

    public void login(String username ,String password ){
        this.userInput.sendKeys(username);
        this.passwordInput.sendKeys(password);
        this.acknowledgeIcon.click();
        this.SignInButton.click();





    }
    public static String message;

        public void login (String submitType){
            if (submitType.equals("submitButton")) {
                userInput.sendKeys(ConfigurationReader.getProperty("username"));
                passwordInput.sendKeys(ConfigurationReader.getProperty("password"));
                acknowledgeIcon.click();
                SignInButton.click();
            }

            if (submitType.equals("enterKey")) {
                userInput.sendKeys(ConfigurationReader.getProperty("username"));
                passwordInput.sendKeys(ConfigurationReader.getProperty("password") + Keys.ENTER);

            }
        }

        public void login (String username, String password, String submitType){
            if (submitType.equals("submitButton")) {
                userInput.sendKeys(username);
                passwordInput.sendKeys(password);
                acknowledgeIcon.click();
                SignInButton.click();
            }
            if (submitType.equals("enterKey")) {
                userInput.sendKeys(username);
                passwordInput.sendKeys(password + Keys.ENTER);

            }

            if (userInput.getText().isEmpty() && passwordInput.getText().isEmpty()) {
                String message1 = userInput.getAttribute("validationMessage");
                String message2 = userInput.getAttribute("validationMessage");
                if (message1.isEmpty()) {
                    message = message2;
                } else {
                    message = message1;
                }

            }

        }
    }

