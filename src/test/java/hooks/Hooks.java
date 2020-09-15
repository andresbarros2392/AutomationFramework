package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {

    @Before("@Regression")
    public void initialize(){
        System.out.println("This is the very first step of Regressions tests");
    }

    @Before("@Smoke")
    public void initializeSmoke(){
        System.out.println("This is the very first step of Smoke tests");
    }

    @BeforeStep
    public void beforeEachTest(){
        System.out.println("Beginning of each test");
    }

    @AfterStep
    public void afterEachTest(){
        System.out.println("Ending of each test");
    }


    @After
    public void finalize(){
        System.out.println("This is for closing everything");
    }
}
