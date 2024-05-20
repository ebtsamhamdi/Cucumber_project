package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage {
    private WebDriver driver;

    //locator
    private By username= By.id("user-name");
    private By password = By.id("password");
    private By loginbutton = By.id("login-button");


    //constractor
    public loginpage(WebDriver driver){
        this.driver= driver;

    }

    //page action
    public void openURL(){
        driver.get("https://www.saucedemo.com/");
    }

    public void filldata(String username_data) {
        driver.findElement(username).sendKeys(username_data);
    }

    public void fillpassword(String password_data){
        driver.findElement(password).sendKeys(password_data);
    }

    public void clicklogin(){
        driver.findElement(loginbutton).click();
    }



}
