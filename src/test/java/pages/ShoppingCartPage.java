package pages;

import StepDefinations.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ShoppingCartPage {

    public WebElement shoppingcartBtn()
    {
        return Hooks.driver.findElement(By.className("cart-label"));
    }




    public WebElement addcartBtn()
    {
        return  Hooks.driver.findElement(By.cssSelector("[class=\"button-2 product-box-add-to-cart-button\"]"));
    }

    public WebElement cartfirstassert()
    {
        return  Hooks.driver.findElement(By.cssSelector("[class=\"content\"]"));
    }


    public WebElement cartsecondassert()
    {
        return   Hooks.driver.findElement(By.cssSelector("[class=\"page-title\"]"));
    }

    public WebElement cartforthassert()
    {
        return   Hooks.driver.findElement(By.id("updatecart"));
    }

    public WebElement cartfifthassert()
    {
        return  Hooks.driver.findElement(By.className("continue-shopping-button"));
    }


}
