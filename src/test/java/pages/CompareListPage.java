package pages;

import StepDefinations.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CompareListPage {

    public WebElement comparelistBtn()
    {
        return Hooks.driver.findElement(By.className("add-to-compare-list-button"));
    }


    public WebElement comparefirstassert()
    {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/compareproducts\"]"));
    }

}
