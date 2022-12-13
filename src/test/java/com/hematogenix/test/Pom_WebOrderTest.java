package com.hematogenix.test;

import com.hematogenix.pages.BasePage;
import com.hematogenix.pages.Web_HDX_login;
import com.hematogenix.utility.BrowserUtils;
import org.testng.annotations.Test;

public class Pom_WebOrderTest extends BasePage{


    @Test
    public void testLogin() {
        Web_HDX_login login = new Web_HDX_login();
        login.togo();




            login.login("TElliott", "Tatyana_123");




        }


        }
