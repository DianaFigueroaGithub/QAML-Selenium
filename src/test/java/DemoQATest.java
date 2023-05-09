import Steps.DemoQASteps;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class DemoQATest extends BaseTest{
    private WebDriver webDriver = getDriver("Chrome");
    DemoQASteps demoQASteps = new DemoQASteps(webDriver);

    @Test
    public void fillInformTest(){
        demoQASteps.getoDemoQAPage();
        demoQASteps.fillUserName("Diana Test");
        demoQASteps.fillEmail("Test@test.com");
        demoQASteps.fillCurrentAddress("Address1");
        demoQASteps.fillPermanentAddress("Address2");
    }
}
