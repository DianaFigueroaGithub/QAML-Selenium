package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSteps extends BaseSteps{

    By searchByID = By.id("APjFqb");
    By searchByName = By.cssSelector("textarea[name='q']");
    By cssSearchButton = By.cssSelector("input[name = 'btnK']");

    public GoogleSteps(WebDriver webDriver) {
        super(webDriver);
    }

    public void goToURL(){
        webDriver.get("https://www.google.com/");
    }

    public void navigateFacebook(){
        webDriver.navigate().to("https://www.facebook.com/");
    }

    public void navigateEspn(){
        webDriver.navigate().to("https://www.espn.com.co/");
    }

    public void getGoogleSearchBarElement(){
         webDriver.findElement(searchByID).sendKeys();
    }

    public void googleSearching(String search){
        webDriver.findElement(searchByID).sendKeys(search);
    }

    public void googleSearchByCssName(String search){
        webDriver.findElement(searchByName).click();
        webDriver.findElement(searchByName).sendKeys(search, Keys.ENTER);
        //driver.findElement(By.id("Value")).sendKeys(Keys.RETURN);
    }

    public void  clickSearchbtn(){
        webDriver.findElement(cssSearchButton).click();
    }
}
