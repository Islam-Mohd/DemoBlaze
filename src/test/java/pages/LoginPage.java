package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.BaseSteps;

public class LoginPage extends BaseSteps {

    public static String EMAIL = "mohd@gmail.com";
    public static String PASSWORD = "shamim96";
    public static String URL = "https://www.demoblaze.com/";

    @FindBy(xpath = "//*[@id=\"login2\"]")
    static WebElement BLAZE_LOGIN;

    @FindBy(xpath = "//*[@id=\"loginusername\"]")
    static WebElement BLAZE_USERNAME;

    @FindBy(xpath = "//*[@id=\"loginpassword\"]")
   static WebElement BLAZE_PASSWORD;

    @FindBy(xpath = "//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")
     static WebElement BLAZE_LOGIN_BTN;

    @FindBy(xpath = "//*[@id=\"nameofuser\"]")
    static WebElement BLAZE_GREETING;

    @FindBy(xpath = "//*[@id=\"itemc\"][1]")
    static WebElement BLAZE_PHONE_SUMSUNG;

    @FindBy(xpath = "//*[@id=\"itemc\"][2]")
    static WebElement BLAZE_MACBOOK_AIR;

    public LoginPage(){
        PageFactory.initElements(driver, this);
    }

    public static void navigate_Url(){
        driver.get(URL);
    }

    public static void clickLogin(){
        BLAZE_LOGIN.click();
    }

    public static void enterText(String  EMAIL, String PASSWORD){
        BLAZE_USERNAME.clear();
        BLAZE_USERNAME.sendKeys(EMAIL);
        BLAZE_PASSWORD.clear();
        BLAZE_PASSWORD.sendKeys(PASSWORD);
    }

    public static void clickBTN(){
        BLAZE_LOGIN_BTN.click();
    }
    public static String click(String mohd){
        return BLAZE_GREETING.getText();

    }
    public static String clickPhone(String SumsungPhones){
        return BLAZE_PHONE_SUMSUNG.getText();

    }
}
