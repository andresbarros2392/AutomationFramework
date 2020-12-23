package hooks;

import base.Base;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

import java.io.IOException;

public class Hooks extends Base {


    @Before()
    public void initialize() throws IOException, InterruptedException {
        System.out.println("Type the code here that must be run before each scenario");
        driver = Base.getDriver();
    }


    @BeforeStep
    public void beforeEachTest(){
        System.out.println("Type the code here that must be run before each step of the current scenario");

    }

    @AfterStep
    public void afterEachTest(){
        System.out.println("Type the code here that must be run after each step of the current scenario");

    }


    @After
    public void finalize(){
        System.out.println("Type the code here that must be run after each scenario");
        driver.close();
    }
}
