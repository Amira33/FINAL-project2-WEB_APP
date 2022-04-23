package StepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;
import pages.SwitchCurrenciesPage;

public class SwitchCurrencies_08 {

 //******************************************************************
    SwitchCurrenciesPage currencies = new SwitchCurrenciesPage();
//*******************************************************************

    @And("user click the switch currencies")
    public void user_click_the_switch_currencies()
{
    //Hooks.driver.findElement(By.id("customerCurrency"))
    currencies.currenciesBtn().click();
}

@Then("Different currencies appears choosen US")
    public void Different_currencies_appears ()
{

    SoftAssert soft = new SoftAssert();
   currencies.uscurr().click();



    Hooks.driver.navigate().refresh();

    System.out.println(" All products are in Us currencies");
    soft.assertTrue( currencies.homepage().isDisplayed());



    // Assert ALL
    soft.assertAll();

}



@And("user choosed Euro")
        public void user_choosed_Euro()
    {
        SoftAssert soft = new SoftAssert();
      currencies.eurocurr().click();


        Hooks.driver.navigate().refresh();

        System.out.println(" All products are in Euro currencies");
        soft.assertTrue( currencies.homepage().isDisplayed());


        // Assert ALL
        soft.assertAll();


    }


}

