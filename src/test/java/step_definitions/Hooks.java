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

=======
>>>>>>> f1a274b3e2d986c8fd38e270c9a0f1923ac4dfd3
    @After
    public void afterScenario(){
        Driver.quitDriver();
    }
<<<<<<< HEAD
=======

>>>>>>> f1a274b3e2d986c8fd38e270c9a0f1923ac4dfd3
}
