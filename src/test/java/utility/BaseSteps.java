package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseSteps {

public static WebDriver driver;


    public static void openBrowser(){
        System.setProperty("webdriver.chrome.driver", "C:/Users/Shamim/ideaProjects/com.DemoBlaze/chromedriver.exe");
                 driver = new ChromeDriver();
                driver.get("https://www.demoblaze.com/");

                driver.manage().window().maximize();
                driver.manage().deleteAllCookies();
                driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);


    }


}
