package com.hematogenix.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class user_loginStep {


    @When("user enters username")
    public void user_enters_username() {
        System.out.println("User enters hdx_user username ");
    }
    @When("user enters password")
    public void user_enters_password() {
        System.out.println("User enters hdx_user password ");
    }
    @Then("user click I Acknowledge button")
    public void user_click_i_acknowledge_button() {
        System.out.println("User click acknowledge button ");
    }
    @Then("user click sign in button")
    public void user_click_sign_in_button() {
        System.out.println("User click sign button");

    }
    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        System.out.println("User should see a dashboard ");

    }
}
