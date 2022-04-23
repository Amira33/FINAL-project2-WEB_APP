package StepDefinations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;
import pages.CompareListPage;

public class CompareList_07 {


    CompareListPage comparelist = new CompareListPage();


    @When("user click the add the product to compare list")
    public  void user_click_the_add_the_product_to_comparelist()
    {
       // Hooks.driver.findElement(By.className("add-to-compare-list-button"))
        comparelist.comparelistBtn() .click();
        System.out.println("you click this button to add the product to the compare list cart");

    }

    @Then("The compare list is displayed the item added")
    public void The_compare_list_is_displayed_the_item_added()
    {

        // soft assertion

        SoftAssert soft = new SoftAssert();

        // first ASSERTION

        System.out.println("first ASSERTION");
        soft.assertTrue( comparelist.comparefirstassert().isDisplayed(),"first assertion ");


        // second ASSERTION

        System.out.println("second ASSERTION");
        comparelist.comparefirstassert().click();
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/compareproducts"),"second assertion");
        System.out.println("\n  find the items in compare list ");




        // Assert ALL
        soft.assertAll();
    }

    }



