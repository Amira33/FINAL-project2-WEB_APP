package StepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.asserts.SoftAssert;
import pages.LoginPage;

public class Login_03
{

    String password ="qwe123";
    String Email ="amira@gmail.com";

    //**************************************************************

    LoginPage log = new LoginPage();  //new object to use in class to call the method

//*******************************************************************

@And("user navigate to login page")
    public void user_navigate_to_login_page()
{
    //Hooks.driver.findElement(By.cssSelector("a[href=\"/login?returnUrl=%2F\"]"))
      log.loginBtn().click();

}

@And("user enter valid Email and password")
    public void user_enter_valid_Email_and_password()

{
//Hooks.driver.findElement(By.id("Email"))
       log.Email().sendKeys(Email);
//Hooks.driver.findElement(By.id("Password"))
       log.Password().sendKeys(password);
}

@When("user click on login button")
    public void user_click_on_login_button()
{

 //Hooks.driver.findElement(By.className("login-button"))
       log.loginbutton().sendKeys(Keys.ENTER);

}


@Then("user could login successfully and go to home page")
    public void user_could_login_successfully_and_go_to_home_page()
{

    //***********soft Assertion ***********

    SoftAssert soft = new SoftAssert();

    // first ASSERTION of register  msg
    System.out.println("first ASSERTION");
    soft.assertTrue(log.logfirstassert().isDisplayed(),"first assertion ");

    // second ASSERTION to check  ( my account)
    System.out.println("second ASSERTION");
    soft.assertTrue(log.logsecondassert().isDisplayed(),"second assertion");

    // Third assertion of url link of register successfully
    System.out.println("Third ASSERTION");
    soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/"),"third assertion");


}

////////////////////////Second scenario invalid email and password ///////////////////////////


@And("user enter invalid Email and password")
    public void user_enter_invalid_Email_and_password()
{
    //Hooks.driver.findElement(By.id("Email"))
    log.Email().sendKeys("qw@test.com");
    //Hooks.driver.findElement(By.id("Password"))
    log.Password().sendKeys("qwe123");
}

@When("user couldn't login successfully and error msg is displayed")
    public void Not_success_login()
{
    String loginexpectedResult = "Login was unsuccessful. Please correct the errors and try again.\n" +
            "No customer account found";
    String loginactualResult = log.invlog().getText();
    System.out.println(loginactualResult);

    Assert.assertTrue(loginactualResult.contains(loginexpectedResult));
    Assert.assertEquals(loginactualResult.contains(loginexpectedResult) ,true );
}



}

