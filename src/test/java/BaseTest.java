import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;

public class BaseTest {
    private WebDriver driver;

    public WebDriver getDriver(String browser) {
        File rootpath;

        switch (browser){
            case  "Chrome":
                rootpath= new File("/Users/diana.figueroa/Desktop/DianysDev/BootcampMavenPlusWebDriver/src/main/resources/Drivers/chromedriver");
                System.setProperty("webdriver.chrome.driver", rootpath.getPath());
                ChromeOptions ops = new ChromeOptions();
                ops.addArguments("--remote-allow-origins=*");
                driver = new ChromeDriver(ops);
                break;

            case "Firefox":
                rootpath= new File("/Users/diana.figueroa/Desktop/DianysDev/BootcampMavenPlusWebDriver/src/main/resources/Drivers/geckodriver");
                System.setProperty("webdriver.gecko.driver", rootpath.getPath());
                FirefoxOptions options1 = new FirefoxOptions();
                options1.addArguments("--remote-allow-origins=*");
                 driver = new FirefoxDriver(options1);
                 break;

            default:
                rootpath= new File("/Users/diana.figueroa/Desktop/DianysDev/BootcampMavenPlusWebDriver/src/main/resources/Drivers/msedgedriver");
                System.setProperty("webdriver.edge.driver", rootpath.getPath());
                EdgeOptions options2 = new EdgeOptions();
                options2.addArguments("--remote-allow-origins=*");
                System.out.println("Driver ready");
                 driver = new EdgeDriver(options2);
                 break;
        }
        return driver;
    }
}
