package stepDefinition;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Hook {
    public static WebDriver driver;
     @Before
    public void openbrowser (){
         driver = new ChromeDriver();
         driver.manage().window().maximize();
         System.out.println("Browser is opened");

     }

     @After
    public void quit(){
         driver.quit();
     }
}
