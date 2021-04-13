package page;

import driver.DriverHolder;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Commons;

public class HomePcFactoryPage extends Commons {

    public HomePcFactoryPage(){
        PageFactory.initElements(DriverHolder.webDriver, this);
    }
/******************************************************ELEMENTOS****************************************************/
    @FindBy(xpath = "//button[@id='search_btn']")
    public WebElement btnBuscar;

    @FindBy(xpath = "//input[@id='search']")
    public WebElement inputBuscador;
/******************************************************METODOS****************************************************/

    public void clicBuscar(){
        validaElemento(btnBuscar,"Boton Buscar");
        click(btnBuscar,"Boton Buscar");
    }

    public void ingresaNombreArticulo(String arg1){
        ingresaTexto(inputBuscador,"Buscador",arg1);
    }

}
