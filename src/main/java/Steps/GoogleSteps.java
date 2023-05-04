package Steps;

import org.openqa.selenium.WebDriver;

public class GoogleSteps extends BaseSteps{

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

}
