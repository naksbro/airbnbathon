package step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import util.Driver;

public class Hooks {

    @Before
    public void beforeScenario() {
        Driver.getDriver();

    }

<<<<<<< HEAD

=======
>>>>>>> 5cb6a441f415558ba50f1845974fa2f1d19d48fd
    @After
    public void afterScenario() {
        Driver.quitDriver();
    }
<<<<<<< HEAD

}
=======
}
>>>>>>> 5cb6a441f415558ba50f1845974fa2f1d19d48fd
