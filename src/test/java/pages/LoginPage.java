package pages;

import StepDefinations.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
    public WebElement loginBtn()
    {
      WebElement loginBtn = Hooks.driver.findElement(By.cssSelector("a[href=\"/login?returnUrl=%2F\"]"));
        return loginBtn;
    }

    public WebElement Email()
    {
        return  Hooks.driver.findElement(By.id("Email"));

    }


    public WebElement Password()
    {
        return Hooks.driver.findElement(By.id("Password"));


    }


public WebElement loginbutton()
{
    return Hooks.driver.findElement(By.className("login-button"));
}


    public WebElement logfirstassert()
    {
        return Hooks.driver.findElement(By.cssSelector("[href=\"/logout\"]"));


    }

    public WebElement logsecondassert()
    {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/customer/info\"]"));


    }


    public WebElement invlog()
    {
        return Hooks.driver.findElement(By.cssSelector("[class=\"message-error validation-summary-errors\"]"));


    }

}
