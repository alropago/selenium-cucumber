package page;

import driver.DriverHolder;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Commons;

public class ResultadoArticuloPage extends Commons {

    public ResultadoArticuloPage(){
        PageFactory.initElements(DriverHolder.webDriver, this);
    }

    /******************************************************ELEMENTOS****************************************************/
    @FindBy(xpath = "(//img[@data-id='caluga_foto'])[1]")
    public WebElement primerResultado;
    /******************************************************METODOS****************************************************/
    public void clicPrimerResultado(){
        validaElemento(primerResultado,"Primer Resultado");
        click(primerResultado,"Primer Resultado");
    }
}
