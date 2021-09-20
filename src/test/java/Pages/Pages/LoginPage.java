package Pages.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    By emailField = By.xpath("//*[@id=\"email\"]");
    By passField = By.xpath("//*[@id=\"password\"]");
    By enterButton = By.xpath("/html/body/div[1]/div[2]/div/div/div/div/form/button");
    By imNotRegiser = By.xpath("/html/body/div[1]/div[2]/div/div/div/div/form/div[3]/a[2]");

    public void typeEmail (String email){
        WebElement login = driver.findElement(emailField);
        login.sendKeys(email);
    }
    public void typePassword (String password){
        WebElement login = driver.findElement(passField);
        login.sendKeys(password);
    }
    public void clickEnterButton (){
        driver.findElement(enterButton).click();
    }
    public void login(String email,String password){
        typeEmail(email);
        typePassword(password);
        clickEnterButton();
    }
    public void clickImNotRegister (){
        driver.findElement(imNotRegiser).click();
    }
}
