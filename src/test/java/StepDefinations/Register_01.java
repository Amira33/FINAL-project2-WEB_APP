package StepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;
import pages.RegisterPage;

public class Register_01 {


    //*********** To change the mandatory field of registertion

    String firstname ="amera";
    String lastname ="atlla";
    String password ="qwe123";
    String confirmpassword ="qwe123";
    String Email ="amira@gmail.com";


//**********************************************************

    RegisterPage register = new RegisterPage();         // new object to use in class to call method
//************************************************************


    @And("user click to register")
    public void user_click_to_register()
    {

       // Hooks.driver.findElement(By.className("ico-register"))
              register.registerBtn().click();
    }

    @When("user enter a valid section of first name,last name and Email")
    public void user_enter_valid_data()
    {
        // for mandatory field
        //Hooks.driver.findElement(By.id("FirstName"))
              register.FirstNameBtn() .sendKeys(firstname);

       // Hooks.driver.findElement(By.id("LastName"))
              register.LastNameBtn() .sendKeys(lastname);

       // Hooks.driver.findElement(By.name("Email"))
              register.REmailBtn().sendKeys(Email);

       //for other field
       // Hooks.driver.findElement(By.id("gender-female"))
               register.GenderBtn().click();

     //   Hooks.driver.findElement(By.id("Company"))
               register.CompanyBtn().sendKeys("any qwasd");

    }

    @And("user enter a valid section of password and confirm password")
    public void user_enter_valid_password()
    {
        //Hooks.driver.findElement(By.id("Password"))
               register.RPasswordBtn() .sendKeys(password);

       // Hooks.driver.findElement(By.id("ConfirmPassword"))
               register.ConfirmPasswordBtn() .sendKeys(confirmpassword);
    }

    @And("user click on register button")
    public void user_click_on_register_button()
    {
       // Hooks.driver.findElement(By.id("register-button"))
               register.RegisterButton() .click();
    }


    @Then("user should register successfully and success msg is appeared")
    public void register_successfully() throws InterruptedException
    {

        String expectedResult = "Your registration completed";
       // String actualResult = Hooks.driver.findElement(By.cssSelector("div[class=\"result\"]")).getText();
        String actualResult = register.RegisterSUCCESS().getText();
        System.out.println(actualResult);

        Assert.assertTrue(actualResult.contains(expectedResult));
        Assert.assertEquals(actualResult.contains(expectedResult) ,true );


        Thread.sleep(5000);

        //***********soft Assertion ***********

        SoftAssert soft = new SoftAssert();

        // first ASSERTION of register  msg
        System.out.println("first ASSERTION");
        soft.assertTrue(register.firstassert().isDisplayed(),"first assertion ");

        // second ASSERTION to check the register ( my account)
        System.out.println("second ASSERTION");
        soft.assertTrue(register.secondassert().isDisplayed(),"second assertion");

        // Third assertion of url link of register successfully
        System.out.println("Third ASSERTION");
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/registerresult/1?returnUrl=/"),"third assertion");

        // forth assertion for button of continue
        System.out.println("forth ASSERTION");
        soft.assertTrue(register.forthassert().isDisplayed(),"forth assertion  ");

        // Assert ALL
        soft.assertAll();
    }



    @And("user logout")
    public  void  user_logout()
    {
      //  Hooks.driver.findElement(By.cssSelector("[href=\"/logout\"]"))
             register.LogoutButton() .click();
    }



}
