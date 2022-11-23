package com.hematogenix.pages;

import com.hematogenix.utility.ConfigurationReader;
import com.hematogenix.utility.Driver;
import org.junit.Test;

public class Utility_InTest extends BasePage{

    @Test
    public void testLogin(){
        String url = ConfigurationReader.read("url");
        String username = ConfigurationReader.read("username");
        String password  = ConfigurationReader.read("password");


        System.out.println("url = " + url);
        System.out.println("username  = " + username);
        System.out.println("password = " + password);

        Driver.getDriver().navigate().to(url);

    }
}
