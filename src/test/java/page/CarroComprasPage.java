package page;

import driver.DriverHolder;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Commons;

public class CarroComprasPage extends Commons {

    public CarroComprasPage(){
        PageFactory.initElements(DriverHolder.webDriver, this);
    }
    /******************************************************ELEMENTOS****************************************************/
    @FindBy(xpath = "(//input[@name='rb_tipo_despacho'])[1]")
    public WebElement despachoDomicilio;

    @FindBy(xpath = "//p[contains(text(),'CONTINUAR COMPRA')]")
    public WebElement btnContinuarCompra;

/******************************************************METODOS****************************************************/
    public void clicContinuarCompra(){
        esperaElemento(btnContinuarCompra,"Boton continuar",5);
        validaElemento(btnContinuarCompra,"Boton Continuar");
        click(btnContinuarCompra,"Boton Continuar");
    }

    public void clicDespachoDomicilio(){
        validaElemento(despachoDomicilio,"Boton Despacho Domicilio");
        click(despachoDomicilio,"Boton Despacho Domicilio");
    }

}
