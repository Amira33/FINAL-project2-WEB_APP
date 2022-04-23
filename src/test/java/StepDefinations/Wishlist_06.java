package StepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;
import pages.WishlistPage;
import pages.SearchPage;

public class Wishlist_06 {


    WishlistPage wishlist = new WishlistPage();
    SearchPage search = new SearchPage();



    @And("user has an empty wishlist")
    public void user_has_an_empty_wishlist()
    {

        //Hooks.driver.findElement(By.className("wishlist-label"))
        wishlist.emptywishlist() .click();
        System.out.println("You have no items in your Wishlist");


    }


   @When("user click the add the product to wishlist")
    public  void user_click_the_add_the_product_to_wishlist()
   {
      // Hooks.driver.findElement(By.className("add-to-wishlist-button"))
       wishlist.addtowishlist() .click();
       System.out.println("you click this button to add the product to the wishlist");

   }

   @Then("The wishlist is displayed the item added")
    public void The_wishlist_is_displayed_the_item_added()
   {

      // soft assertion


       SoftAssert soft = new SoftAssert();

       // first ASSERTION

       System.out.println("first ASSERTION");
       soft.assertTrue(wishlist.wishlistfirstassert().isDisplayed(),"first assertion ");


       // second ASSERTION

       System.out.println("second ASSERTION");
       Hooks.driver.findElement(By.cssSelector("a[href=\"/wishlist\"]")).click();
       soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/wishlist"),"second assertion");

       // Third ASSERTION

       System.out.println("Third ASSERTION");
       soft.assertTrue( wishlist.wishlistthirdassert().isDisplayed(),"Third assertion ");


       // forth assert
       System.out.println("another assert");
       soft.assertTrue( wishlist.wishlistanotherassert().isDisplayed(),"forth assertion ");




       // Assert ALL
       soft.assertAll();
   }



   @And("user search for flower  Jewelry")
   public void flower_jewelry()
   {
       Hooks.driver.navigate().refresh();
       search.searchCamera().sendKeys("flower");
       search.cameraBtnsearch() .click();
       Hooks.driver.navigate().refresh();
      // wishlist.addtowishlist() .click();
   }

@And("count the num of product in wishlist")
    public void product_wishlist_quantaty()
{
    Hooks.driver.findElement(By.className("wishlist-label")) .click();
    String firstrow = wishlist.quantaty().get(0).getAttribute("value");
    System.out.println(firstrow);

    String secondrow = wishlist.quantaty().get(1).getAttribute("value");
    System.out.println(secondrow);


    int wishlisttotal = Integer.parseInt(firstrow) + Integer.parseInt(secondrow);
    System.out.println("Wishlist Total product =   " + wishlisttotal);
}

}
