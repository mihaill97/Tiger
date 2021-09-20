package Pages.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }
    By buttonEnter = By.xpath("/html/body/div[1]/header/div[2]/ul/li[4]/a");
    By dropMenu = By.xpath("/html/body/div[1]/header/div[3]");
    By exitButton = By.xpath("//*[@id=\"right-user-menu\"]/div/ul/li[6]/a");

    public void clickButtonEnter (){
        driver.findElement(buttonEnter).click();
    }
    public void exitMenu (){
        driver.findElement(dropMenu).click();
        driver.findElement(exitButton).click();
    }
}
