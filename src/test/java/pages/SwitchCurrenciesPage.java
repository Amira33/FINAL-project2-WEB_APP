package pages;

import StepDefinations.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SwitchCurrenciesPage {

    public WebElement currenciesBtn()
    {
        return  Hooks.driver.findElement(By.id("customerCurrency"));
    }


    public WebElement uscurr()
    {
        return   Hooks.driver.findElement(By.cssSelector("[value=\"https://demo.nopcommerce.com/changecurrency/1?returnUrl=%2F\"]"));
    }



    public WebElement homepage()
    {
        return  Hooks.driver.findElement(By.className("home-page-product-grid"));
    }

    public WebElement eurocurr()
    {
        return  Hooks.driver.findElement(By.cssSelector("[value=\"https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F\"]"));
    }



}
