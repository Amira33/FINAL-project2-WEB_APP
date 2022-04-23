package StepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.asserts.SoftAssert;
import pages.LoginPage;
import pages.ResetPasswordPage;

public class ResetPassword_09 {

    String Email ="amii@gmail.com";

    LoginPage log = new LoginPage();
    ResetPasswordPage resetpass = new ResetPasswordPage();



    @And("user click on Forgot password button")
    public void forogt_password()
    {
       // Hooks.driver.findElement(By.cssSelector("[href=\"/passwordrecovery\"]"))
              resetpass.forgotPssBtn() .click();
    }


    @When("Password recovery page opened")
    public void recovery_page_opened()
    {
        Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/passwordrecovery");
        System.out.println("link recovery is ok and user go to recovery page");
    }


    @And("ask user to enter yor email address")
    public void ask_user_to_enter_yor_email_address()
    {
       // Hooks.driver.findElement(By.id("Email"))
           log.Email().sendKeys(Email);
    }

    @And("click on recover button")
    public void click_on_recover_button()
    {
       // Hooks.driver.findElement(By.name("send-email"))
              resetpass.recoverBtn() .sendKeys(Keys.ENTER);
    }


    @Then("msg recovery sent")
    public void msg_recovery_sent()
    {


        String recexpectedResult = "Email with instructions has been sent to you.";
        String recactualResult = resetpass.msgrecover().getText();
        System.out.println(recactualResult);

        Assert.assertTrue(recactualResult.contains(recexpectedResult));
        Assert.assertEquals(recactualResult.contains(recexpectedResult) ,true );

//***********soft Assertion ***********

        SoftAssert soft = new SoftAssert();

        // first ASSERTION of recovery  msg
        System.out.println("first ASSERTION");
        soft.assertTrue(resetpass.assertrecover().isDisplayed(),"first assertion ");


    }





}
