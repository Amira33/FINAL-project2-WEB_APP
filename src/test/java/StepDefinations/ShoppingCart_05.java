package StepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;
import pages.ShoppingCartPage;

public class ShoppingCart_05
{
//****************************************************
    ShoppingCartPage cart = new ShoppingCartPage();
//*****************************************************

    @And("user navigate to home page")
    public  void user_navigate_to_home_page()
    {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/");
    }


    @And("user has an empty shopping cart")
    public void user_has_an_empty_shopping_cart()
    {
       // Hooks.driver.findElement(By.className("cart-label"))
           cart.shoppingcartBtn() .click();
        System.out.println("You have no items in your shopping cart");


    }


    @When("user click the add to cart button to add the product to shopping cart")
    public void user_click_the_add_to_cart_button()
    {

       // Hooks.driver.findElement(By.cssSelector("[class=\"button-2 product-box-add-to-cart-button\"]"))
          cart.addcartBtn().click();
        System.out.println("you click this button to add the product to the shopping cart");

    }


    @Then("The shopping cart is displayed the item added")
    public void The_shopping_cart_is_displayed_the_item_added() throws InterruptedException {

     // soft assertion

        SoftAssert soft = new SoftAssert();

        // first ASSERTION
        System.out.println("first ASSERTION");
        soft.assertTrue( cart.cartfirstassert().isDisplayed(),"first assertion ");


        // second ASSERTION

        System.out.println("second ASSERTION");
        soft.assertTrue( cart.cartsecondassert().isDisplayed(),"second assertion ");

       // Third Assertion

        System.out.println("Third ASSERTION");
        Hooks.driver.findElement(By.cssSelector("[href=\"/cart\"]")).click();
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/cart"),"third assertion");


        // Forth ASSERTION

        System.out.println("Forth ASSERTION");
        soft.assertTrue(cart.cartforthassert().isDisplayed(),"Forth assertion ");


        // Fifth ASSERTION

        System.out.println("Fifth ASSERTION");
        soft.assertTrue( cart.cartfifthassert().isDisplayed(),"Fifth assertion ");


        // Assert ALL
        soft.assertAll();

    }
}
