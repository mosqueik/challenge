package steps.def;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends BaseTest {

    @Before
    public void beforeScenario(Scenario scenario) {
        System.out.println(scenario.getName());
    }
}
