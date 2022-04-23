package pages;

import StepDefinations.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WishlistPage {

    public WebElement emptywishlist()
    {

        return Hooks.driver.findElement(By.className("wishlist-label"));
    }


    public WebElement addtowishlist()
    {

        return  Hooks.driver.findElement(By.className("add-to-wishlist-button"));
    }


    public WebElement wishlistfirstassert()
    {

        return   Hooks.driver.findElement(By.cssSelector("a[href=\"/wishlist\"]"));
    }



    public WebElement wishlistthirdassert()
    {

        return  Hooks.driver.findElement(By.id("updatecart"));
    }



    public WebElement wishlistanotherassert()
    {

        return  Hooks.driver.findElement(By.className("wishlist-add-to-cart-button"));
    }


public List<WebElement> quantaty()
{
    return Hooks.driver.findElements(By.className("qty-input"));
}

}
