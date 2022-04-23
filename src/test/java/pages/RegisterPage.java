package pages;

import StepDefinations.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterPage {

    public WebElement registerBtn()
    {
        WebElement registerBtn = Hooks.driver.findElement(By.className("ico-register"));
        return registerBtn;
    }

    public WebElement FirstNameBtn ()
    {
        return Hooks.driver.findElement(By.id("FirstName"));
    }

    public WebElement LastNameBtn ()
    {
        return  Hooks.driver.findElement(By.id("LastName")) ;
    }


    public WebElement REmailBtn ()
    {
        return  Hooks.driver.findElement(By.name("Email"));
    }



    public WebElement GenderBtn ()
    {
        return  Hooks.driver.findElement(By.id("gender-female"));
    }

    public WebElement CompanyBtn ()
    {
        return   Hooks.driver.findElement(By.id("Company"));
    }


    public WebElement RPasswordBtn ()
    {
        return  Hooks.driver.findElement(By.id("Password"));
    }


    public WebElement ConfirmPasswordBtn ()
    {
        return  Hooks.driver.findElement(By.id("ConfirmPassword"));
    }



    public WebElement RegisterButton ()
    {
        return Hooks.driver.findElement(By.id("register-button"));
    }



    public WebElement RegisterSUCCESS()
    {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"result\"]"));
    }



    public WebElement firstassert()
    {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"result\"]"));
    }



    public WebElement secondassert()
    {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/customer/info\"]"));
    }



    public WebElement forthassert()
    {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/\"]"));
    }



    public WebElement LogoutButton ()
    {
        return Hooks.driver.findElement(By.cssSelector("[href=\"/logout\"]"));
    }



}
