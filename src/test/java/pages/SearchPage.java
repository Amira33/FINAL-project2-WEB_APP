package pages;

import StepDefinations.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchPage {

    public WebElement searchBtn()
    {
        return Hooks.driver.findElement(By.id("small-searchterms"));
    }


    public WebElement searchCamera()
    {
        return Hooks.driver.findElement(By.id("small-searchterms"));
    }


    public WebElement cameraBtnsearch ()
    {
        return  Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 search-box-button\"]"));
    }


    public WebElement searchJewellry()
    {
        return Hooks.driver.findElement(By.cssSelector("[href=\"/jewelry\"]"));
    }



    public WebElement aassertcheckphoto()
    {
        return Hooks.driver.findElement(By.className("category-page"));
    }



}
