package steps;

import driver.DriverHolder;
import io.cucumber.java.en.Given;

public class BaseSteps {
    @Given("Ingreso a url {string}")
    public void ingresoAUrl(String arg0) {
        DriverHolder.webDriver.get(arg0);
    }
}
