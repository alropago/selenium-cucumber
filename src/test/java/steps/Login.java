package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import page.LoginPage;

public class Login {
LoginPage loginPage = new LoginPage();
    @And("Ingreso {string} y {string}")
    public void ingresoY(String arg0, String arg1) {
        loginPage.ingresaRut(arg0);
        loginPage.ingresaContrasenia(arg1);
    }

    @Then("Se valida el siguente mensaje de error desplegado: {string}")
    public void seValidaElSiguenteMensajeDeErrorDesplegado(String arg0) throws InterruptedException {
        loginPage.validaTextoRutInvalido(arg0);

    }

    @And("Se da clic a boton iniciar sesion")
    public void seDaClicABotonIniciarSesion() {
        loginPage.clicIniciarSesion();

    }
}
