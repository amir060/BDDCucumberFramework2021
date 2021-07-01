package com.swaglabs.stepdefinitions;

import com.swaglabs.base.BasePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before
    public void setUp(){
        BasePage.initializeDriver();
    }
    @After
    public void tearDown(){
        BasePage.tearDown();
    }


}
