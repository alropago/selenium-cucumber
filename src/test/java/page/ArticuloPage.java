package page;

import driver.DriverHolder;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Commons;

public class ArticuloPage extends Commons {

    public ArticuloPage(){
        PageFactory.initElements(DriverHolder.webDriver, this);
    }

    /******************************************************ELEMENTOS****************************************************/

    @FindBy(xpath = "//p[contains(text(),'Agregar al Carro')]")
    public WebElement btnAgregarCarro;

    /******************************************************METODOS****************************************************/

    public void clicAgregarCarro(){
        validaElemento(btnAgregarCarro,"Boton agregar carro");
        click(btnAgregarCarro,"Boton agregar carro");
    }
}
