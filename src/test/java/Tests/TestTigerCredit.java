package Tests;
import Pages.Pages.FirstStepPage;
import Pages.Pages.LoginPage;
import Pages.Pages.MainPage;
import Pages.Pages.SecondStepPage;
import Settings.ChromeSettings;
import org.junit.Test;

public class TestTigerCredit extends ChromeSettings {
    @Test
    public void LoginTigerCredit ()throws InterruptedException{
        MainPage  mainPage = new MainPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        //actions
        mainPage.clickButtonEnter();
        loginPage.login(userEmail,userPassword);
        mainPage.exitMenu();
    }
    @Test
    public void RegistrationTiger () throws InterruptedException{
        MainPage mainPage = new MainPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        FirstStepPage firstStepPage = new FirstStepPage(driver);
        SecondStepPage secondStepPage = new SecondStepPage(driver);
        //actions
        mainPage.clickButtonEnter();
        loginPage.clickImNotRegister();
        //first step page
        firstStepPage.typeData();
        firstStepPage.clickAgreeWithTerms();
        firstStepPage.clickButtonContinue();
        Thread.sleep(1000);
        //second step page
        secondStepPage.typeData();
        secondStepPage.clickButtonContin();
    }

}

