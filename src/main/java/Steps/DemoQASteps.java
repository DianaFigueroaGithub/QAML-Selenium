package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoQASteps extends BaseSteps {

    By userNameElement = By.id("userName");
    By email = By.id("userEmail");
    By currentAddress = By.id("currentAddress");
    By permanentAddress = By.id("permanentAddress");
    public DemoQASteps(WebDriver webDriver) {
        super(webDriver);
    }

    public void getoDemoQAPage(){
        webDriver.get("https://demoqa.com/text-box/");
    }

    public void fillUserName(String name){
        webDriver.findElement(userNameElement).sendKeys(name);
    }

    public void fillEmail(String emailIn){
        webDriver.findElement(email).sendKeys(emailIn);
    }

    public void fillCurrentAddress(String currentAddressIn){
        webDriver.findElement(currentAddress).sendKeys(currentAddressIn);
    }

    public void fillPermanentAddress(String permanentAddressIn){
        webDriver.findElement(permanentAddress).sendKeys(permanentAddressIn);
    }


}
