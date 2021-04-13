package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import page.CarroComprasPage;

public class CarroCompras {
    CarroComprasPage carroComprasPage = new CarroComprasPage();

    @And("Se le da clic al boton de despacho a domicilio")
    public void seLeDaClicAlBotonDeDespachoADomicilio() {
        carroComprasPage.clicDespachoDomicilio();
    }

    @And("Se le da clic al boton comprar")
    public void seLeDaClicAlBotonComprar() {
        carroComprasPage.clicContinuarCompra();
    }
}
