package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {
    private WebDriver driver;

    //locator
    private By logodisplay = By.className("app_logo");

    // Constructor
    public Homepage(WebDriver driver) {
        this.driver = driver;
    }

    //pageaction
    public boolean logo(){
       return driver.findElement(logodisplay).isDisplayed();
    }

}
