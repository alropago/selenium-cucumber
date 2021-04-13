package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import page.ArticuloPage;

public class Articulo {
    ArticuloPage articuloPage = new ArticuloPage();

    @And("Se da clic al boton agregar al carro")
    public void seDaClicAlBotonAgregarAlCarro() {
        articuloPage.clicAgregarCarro();

    }
}
