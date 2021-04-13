package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import page.ResultadoArticuloPage;

public class ResultadoArticulo {
ResultadoArticuloPage resultadoArticuloPage = new ResultadoArticuloPage();

    @And("Selecciono el articulo")
    public void seleccionoElArticulo() {

        resultadoArticuloPage.clicPrimerResultado();
    }
}
