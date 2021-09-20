package Pages.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FirstStepPage {
    private WebDriver driver;
    public FirstStepPage(WebDriver driver) {
        this.driver = driver;
    }
    By salaryField = By.xpath("//*[@id=\"filter_amount_input1\"]");
    By firstName = By.xpath("//*[@id=\"first_name\"]");
    By lastName = By.xpath("//*[@id=\"last_name\"]");
    By fatherName = By.xpath("//*[@id=\"father_name\"]");
    By dateBirth = By.xpath("//*[@id=\"birth_date\"]");
    By phoneNumb = By.xpath("//*[@id=\"phone\"]");
    By emailField = By.xpath("//*[@id=\"email\"]");
    By agreeWithterms = By.xpath("//*[@id=\"agree_with_terms\"]");
    By buttonContinue = By.xpath("//*[@id=\"first-step\"]/div[3]/button");

    public void typeData(){
        driver.findElement(salaryField).sendKeys("50000");
        driver.findElement(firstName).sendKeys("Тест");
        driver.findElement(lastName).sendKeys("Тестовичан");
        driver.findElement(fatherName).sendKeys("Тестович");
        driver.findElement(dateBirth).sendKeys("12121997");
        driver.findElement(phoneNumb).sendKeys("+7 (900) 000-0000");
        driver.findElement(emailField).sendKeys("testaak@gmail.com");
    }
    public void clickAgreeWithTerms (){
        driver.findElement(agreeWithterms).click();
    }
    public  void clickButtonContinue(){
        driver.findElement(buttonContinue).click();
    }


}
