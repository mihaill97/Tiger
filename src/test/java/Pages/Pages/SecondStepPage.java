package Pages.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecondStepPage {
    private WebDriver driver;
    public SecondStepPage(WebDriver driver) {
        this.driver = driver;
    }
    By userPassport = By.xpath("//*[@id=\"user-passport_seria_number\"]");
    By passportSubvission = By.xpath("//*[@id=\"passport_subdivision_code\"]");
    By birthPlace = By.xpath("//*[@id=\"passport_birth_place\"]");
    By userPassissued = By.xpath("//*[@id=\"user-passport_issued_at\"]");
    By issueBy = By.xpath("//*[@id=\"passport_issued_by\"]");
    By userSalary = By.xpath("//*[@id=\"user-salary\"]");
    By regionField = By.xpath("//*[@id=\"registration_region\"]");
    By cityField = By.xpath("//*[@id=\"registration_city\"]");
    By streetField = By.xpath("//*[@id=\"registration_street\"]");
    By numberHouse = By.xpath("//*[@id=\"registration_housenum\"]");
    By buttonContin = By.xpath("//*[@id=\"second-step-submit\"]");

    public void typeData (){
        driver.findElement(userPassport).sendKeys("1123-232132");
        driver.findElement(passportSubvission).sendKeys("010-001");
        driver.findElement(birthPlace).sendKeys("Москва");
        driver.findElement(userPassissued).sendKeys("12122020");
        driver.findElement(issueBy).sendKeys("МВД ПО РЕСП. АДЫГЕЯ");
        driver.findElement(userSalary).sendKeys("50000");
        driver.findElement(regionField).sendKeys("Москва");
        driver.findElement(cityField).sendKeys("г Москва");
        driver.findElement(streetField).sendKeys("пр-кт Вернадского");
        driver.findElement(numberHouse).sendKeys("д 4");
    }
    public void clickButtonContin (){
        driver.findElement(buttonContin).click();
    }

}
