package Pages.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }
    By buttonEnter = By.xpath("//a[@class = 'navigation-menu__link text-decoration' and contains (text(),'Вход')]");
    By dropMenu = By.xpath("//div[@class = 'header__user-panel user-panel']");
    By exitButton = By.xpath("//a[@href = '/logout'and contains (@class ,'user-menu__block-link clickable__button')]");

    public void clickButtonEnter (){
        driver.findElement(buttonEnter).click();
    }
    public void exitMenu (){
        driver.findElement(dropMenu).click();
        driver.findElement(exitButton).click();
    }
}
