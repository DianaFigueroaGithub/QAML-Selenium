import Steps.GoogleSteps;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NavigateTestExercise2 extends BaseTest{
    private WebDriver driver = getDriver("Chrome");
    GoogleSteps steps = new GoogleSteps(driver);
    private String currentURLGoogle;
    private String currentURFace;
    private String currentURLtitle;
    private String currentURLESPN;

    @Test
    public void navigateTest(){
        steps.goToURL();
        currentURLGoogle = steps.getCurrentURL();
        steps.printInConsoleString(currentURLGoogle);
        Assert.assertEquals(currentURLGoogle.contains("google.com"),true);

        steps.navigateFacebook();
        currentURLtitle = steps.getTitleCurrentURL();
        steps.printInConsoleString(currentURLtitle);
        Assert.assertEquals(currentURLtitle.contains("Facebook"),true);

        steps.navigateEspn();
        currentURLESPN = steps.getCurrentURL();
        steps.printInConsoleString(currentURLESPN);
        Assert.assertEquals(currentURLESPN,"https://www.espn.com.co/");

        steps.navigateBack();
         currentURFace = steps.getCurrentURL();
        steps.printInConsoleString(currentURFace);
        Assert.assertEquals(currentURFace.contains("facebook"),true);

        steps.navigateBack();
        currentURLGoogle = steps.getCurrentURL();
        steps.printInConsoleString(steps.getTitleCurrentURL());
        Assert.assertEquals(currentURLGoogle.contains("google.com"),true);

        steps.navigateForward();
        steps.refreshPage();
        currentURFace = steps.getCurrentURL();
        steps.printInConsoleString(currentURFace);
        Assert.assertEquals(currentURFace.contains("facebook"),true);

        steps.endWebDriver();
    }






}
