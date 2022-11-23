package com.hematogenix.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.List;

public class List_Of_ParametersStepDef {


   // Step undefined
   // You can implement this step and 1 other step(s) using the snippet(s) below:


    @Given("user see all  parameters")
    public void user_see_all_parameters(List<String>parameters) {
        System.out.println(parameters);
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        throw new io.cucumber.java.PendingException();
    }




}
