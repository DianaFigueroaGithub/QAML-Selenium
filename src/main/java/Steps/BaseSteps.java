package Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseSteps {
    public WebDriver webDriver;


    public BaseSteps(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public String getCurrentURL() {
        String urlActual = webDriver.getCurrentUrl();
        return urlActual;
    }

    public String getTitleCurrentURL() {
        String urlActual = webDriver.getTitle();
        return urlActual;
    }

    public void closeBrowser(){
        webDriver.close();
    }
    public void endWebDriver(){

        webDriver.quit();
    }

    public String getCurrentCode(){
        return webDriver.getPageSource();
    }

    public void printInConsoleString (String paramtoPrint){
        System.out.println(paramtoPrint);
    }

    public void goToAnyUrl(String URL){
        webDriver.get(URL);
    }

    public void navigateTo(String URL){
        webDriver.navigate().to(URL);
    }

    public void navigateBack(){
        webDriver.navigate().back();
    }

    public void navigateForward(){
        webDriver.navigate().forward();
    }

    public void refreshPage(){
        webDriver.navigate().refresh();
    }



}
