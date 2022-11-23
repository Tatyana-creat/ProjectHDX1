package com.hematogenix.pages;

import com.hematogenix.utility.Driver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage(){PageFactory.initElements(Driver.getDriver(),this);}
}
