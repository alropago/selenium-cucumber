package steps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.HomePcFactoryPage;

public class HomePcFactory {
    HomePcFactoryPage homePcFactoryPage = new HomePcFactoryPage();

    @Given("Ingreso nombre de articulo {string}")
    public void ingresoNombreDeArticulo(String arg0) {
        homePcFactoryPage.ingresaNombreArticulo(arg0);
    }

    @When("Se da clic al boton buscar")
    public void seDaClicAlBotonBuscar() {
    homePcFactoryPage.clicBuscar();
    }
}