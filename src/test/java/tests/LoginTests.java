package tests;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import utility.BaseSteps;

public class LoginTests extends BaseSteps {
    public static BaseSteps chrome;
    public static LoginPage loginPage;


    @BeforeMethod
    public static void setUp(){
        chrome = new BaseSteps();
        chrome.openBrowser();
        loginPage.navigate_Url();
    }

@Test
    public void tc_01withCredential() throws InterruptedException{
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        loginPage = new LoginPage();

        loginPage.clickLogin();

        Thread.sleep(2000);

        loginPage.enterText("mohd@gmail.com","shamim96");
    try {
        Thread.sleep(3000);
    }catch (InterruptedException e){
        e.printStackTrace();
    }

        loginPage.clickBTN();
    Thread.sleep(2000);
    System.out.println(loginPage.click("BLAZE_GREETING"));


    try {
        Thread.sleep(3000);
    }catch (InterruptedException e){
        e.printStackTrace();
    }
    System.out.println(loginPage.clickPhone("BLAZE_PHONE_SUMSUNG"));

    }

    @Test
    public void tc_02withWrongCredential()throws InterruptedException{


        loginPage.clickLogin();

        Thread.sleep(2000);

        loginPage.enterText("BLaze_WRONG","BLAZE_WRONG");
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }




        loginPage.clickBTN();
    }

@AfterTest
    public void tearDown(){

            driver.close();
            driver.quit();
        }

    }

