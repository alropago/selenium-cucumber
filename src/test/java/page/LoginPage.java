package page;

import driver.DriverHolder;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Commons;

public class LoginPage extends Commons {

    public LoginPage(){
        PageFactory.initElements(DriverHolder.webDriver, this);
    }

    /******************************************************ELEMENTOS****************************************************/
    @FindBy(xpath = "(//div[@id='columna2FORMNO']/input[@id='rutId1'])[1]")
    public WebElement inputRut;

    @FindBy(xpath = "(//div[@id='columna2FORMNO']/input[@id='rutId2'])[1]")
    public WebElement inputContrasenia;

    @FindBy(xpath = "//p[contains(text(),'Iniciar Sesi\u00F3n')]")
    public WebElement btnIniciarSesion;


    /******************************************************METODOS****************************************************/

    public void ingresaRut(String arg0){
        esperaElemento(inputRut,"Rut",5);
        ingresaTexto(inputRut,"Ingresa Rut",arg0);
    }
    public void ingresaContrasenia(String arg1){
        ingresaTexto(inputContrasenia,"Ingresa Contrasenia",arg1);
    }
    public void clicIniciarSesion(){
        validaElemento(btnIniciarSesion,"Boton Iniciar Sesion");
        click(btnIniciarSesion,"Boton Iniciar Sesion");
    }

    public void validaTextoRutInvalido(String arg0) throws InterruptedException {
        Thread.sleep(2000);
        WebElement texto = elemento("//p[contains(text(),'"+arg0+"')]","Rut invalido");
        validaElemento(texto,"Rut invalido");
    }
}
