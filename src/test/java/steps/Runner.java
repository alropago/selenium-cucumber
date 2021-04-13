package steps;

import driver.DriverHolder;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runner {

    @Before
    public void before(){
        //Setear property driver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alex Parra Gonzalez\\IdeaProjects\\Project\\driver\\chromedriver.exe");
        DriverHolder.webDriver = new ChromeDriver();
        DriverHolder.webDriver.manage().window().maximize();
    }

    @After
    public void after(){
        DriverHolder.webDriver.close();
    }
}
