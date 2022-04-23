package pages;

import StepDefinations.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SuccessfulOrderPage {

    public WebElement servicesterms()
    {
        return  Hooks.driver.findElement(By.id("termsofservice"));
    }


    public WebElement checkout()
    {
        return  Hooks.driver.findElement(By.id("checkout"));
    }

}
