package step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import util.Driver;

public class Hooks {

    @Before
    public void beforeScenario() {
        Driver.getDriver();

    }

    @After
    public void afterScenario() {
        Driver.quitDriver();
    }
<<<<<<< HEAD


=======
>>>>>>> 044603294d32c23e5a43374369b843966c7cc50a
}