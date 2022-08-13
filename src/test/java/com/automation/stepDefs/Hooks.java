package com.automation.stepDefs;


import com.automation.utilities.ConfigReader;
import com.automation.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;



public class Hooks {

    @Before
    public void setUp(){
        ConfigReader.initProperties();
        Driver.createDriver();
    }

    @After
    public void quit(){
        Driver.getDriver().quit();
    }
}
