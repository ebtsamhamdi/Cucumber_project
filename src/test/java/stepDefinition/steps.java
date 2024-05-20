package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.Homepage;
import pages.loginpage;

public class steps {
    private WebDriver driver=Hook.driver;
    private loginpage Loginpage= new loginpage(driver);
    private Homepage homepage = new Homepage(driver);



    @Given("Fill username and password")
    public void fill_username_and_password(){
       Loginpage.openURL();
       Loginpage.filldata("standard_user");
       Loginpage.fillpassword("secret_sauce");
    }


    @When("click on login button")
    public void click_on_login_button(){
        Loginpage.clicklogin();

    }

    @Then("navigate homepage")
    public void navigate_homepage(){
       Assert.assertTrue("We aren't logged in",homepage.logo());
    }
}
