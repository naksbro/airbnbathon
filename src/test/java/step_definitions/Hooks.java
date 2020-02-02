package step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import util.Driver;

public class Hooks {

    @Before
    public void beforeScenario(){
        Driver.getDriver();

    }

<<<<<<< HEAD
    @After
    public void afterScenario(){
        Driver.quitDriver();
    }
=======
<<<<<<< HEAD
    @After
    public void afterScenario(){
        Driver.quitDriver();

    }
=======
//    @After
//    public void afterScenario(){
//        Driver.quitDriver();
//    }
>>>>>>> f053824cc8ce4ba7e9f16aecfbe74d77251d079c
>>>>>>> 477b3c1cbd1f1ff0988fedd9a53ab0ab1966c29f
}
