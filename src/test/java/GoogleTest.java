import Steps.GoogleSteps;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest {
    private WebDriver webDriver = getDriver("Chrome");
    private GoogleSteps googleSteps = new GoogleSteps(webDriver);

    @Test
    public void openGoogleTest(){
        googleSteps.goToURL();
        String urlActual = googleSteps.getCurrentURL();
        System.out.println("URL: " + urlActual);
        Assert.assertEquals(urlActual.contains("google.com"),true);
    }

    @Test
    public void titleGoogleTest(){
        googleSteps.goToURL();
        String currentTitle = googleSteps.getTitleCurrentURL();
        System.out.println("Current page title: "+currentTitle);
        Assert.assertEquals(currentTitle, "Google");
    }

    @Test
    public void getSourceCode(){
        googleSteps.goToURL();
        String sourceCode = googleSteps.getCurrentCode();
        System.out.println("Current page code : "+sourceCode);
    }

    @Test
    public void googleSearch(){
        googleSteps.goToURL();
        googleSteps.googleSearchByCssName("Maven");
        //googleSteps.clickSearchbtn();
    }


    @AfterTest
    public void endDriver(){
        googleSteps.endWebDriver();

    }

}
