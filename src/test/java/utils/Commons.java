package utils;

import driver.DriverHolder;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Commons {

    public void click(WebElement elemento, String nombreElemento){
     try {
         elemento.click();
         System.out.println("Se da click al siguiente elemento: " + nombreElemento);

     }catch (Exception e){
         System.out.println("[ERROR] No se pudo dar click al siguiente elemento = " + nombreElemento);
         DriverHolder.webDriver.close();
     }
    }

    public void validaElemento(WebElement elemento, String nombreElemento){
        try {
            if(elemento.isDisplayed()){
                System.out.println("Se a encontrado el siguiente elemento: "+nombreElemento);
            }
        }catch (NoSuchElementException e){
            System.out.println("[ERROR] No se pudo encontrar el siguiente elemento: " + nombreElemento);
            DriverHolder.webDriver.close();
        }
    }

    public void ingresaTexto(WebElement elemento, String nombreElemento, String texto){
        validaElemento(elemento,nombreElemento);
        try{
            elemento.clear();
            elemento.sendKeys(texto);
            System.out.println("Se ha ingresado el siguiente texto: ["+texto+"] al siguiente elemento ["+nombreElemento+"]");
        }catch (Exception e){
            System.out.println("[ERROR] No se ha podido ingresar el siguiente texto: ["+texto+"] al siguiente elemento ["+nombreElemento+"]");
            DriverHolder.webDriver.close();
        }

    }
    public static WebElement elemento(String xpath, String nombreElemento) {
        WebElement element = null;
        try {
            element = DriverHolder.webDriver.findElement(By.xpath(xpath));
        } catch (Exception e) {
            System.out.println("[Error] No se encontro el siguiente elemento" + nombreElemento);
        }
        return element;
    }
    public void esperaElemento(WebElement xpath,String nombreElemento, int segundos){
        try {
            WebDriverWait wait = new WebDriverWait(DriverHolder.webDriver,segundos);
            wait.until(ExpectedConditions.visibilityOf(xpath));
            System.out.println("Se encontro elemento: "+nombreElemento);
        }catch (Exception e){
            System.out.println("No se encontro el elemento");
        }
    }
}
