package pages;

import StepDefinations.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ResetPasswordPage {

    public WebElement forgotPssBtn()
    {
        return  Hooks.driver.findElement(By.cssSelector("[href=\"/passwordrecovery\"]"));
    }


    public WebElement recoverBtn()
    {
        return   Hooks.driver.findElement(By.name("send-email"));
    }


    public WebElement msgrecover()
    {
        return   Hooks.driver.findElement(By.cssSelector("[class=\"content\"]"));
    }

    public WebElement assertrecover()
    {
       return Hooks.driver.findElement(By.cssSelector("[class=\"bar-notification success\"]"));
    }



}
