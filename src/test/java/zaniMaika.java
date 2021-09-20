import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class zaniMaika {
    private WebDriver driver;
    @Before
    public void setUp(){
        // путь к драйверу
        System.setProperty("webdriver.chrome.driver", "/Users/misha/tools/chromedriver-2");
        //установка драйвера
        driver = new ChromeDriver();
        //ссылка на хаб
        driver.get("https://tigercredit.ru/");
        driver.manage().window().maximize();
    }
    @After
    public void cleanUp(){
        driver.quit();
    }
    //Test authorization on zanimaika.ru
    @Test
    public void loginZanimaika () throws InterruptedException{

        WebElement buttonEnter = driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/ul/li[4]/a"));
        buttonEnter.click();
        Thread.sleep(1000);
        WebElement emailField = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        emailField.sendKeys("wowcirkle7991@gmail.com");
        WebElement passField = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        passField.sendKeys("GrJ1YnjZ");
        WebElement enterButton = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/form/button"));
        enterButton.click();
        WebElement dropMenu = driver.findElement(By.xpath("/html/body/div[1]/header/div[3]"));
        dropMenu.click();
        WebElement exitButton = driver.findElement(By.xpath("//*[@id=\"right-user-menu\"]/div/ul/li[6]/a"));
        exitButton.click();
    }
// registration on zanimaika
    @Test
    public void reistrationZanim () throws InterruptedException{
        WebElement buttonEnter = driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/ul/li[4]/a"));
        buttonEnter.click();
        Thread.sleep(1000);
        WebElement imNotreg = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/form/div[3]/a[2]"));
        imNotreg.click();
        WebElement salaryField = driver.findElement(By.xpath("//*[@id=\"filter_amount_input1\"]"));
        salaryField.sendKeys("50000");
        WebElement firstName = driver.findElement(By.xpath("//*[@id=\"first_name\"]"));
        firstName.sendKeys("Тест");
        WebElement lastName = driver.findElement(By.xpath("//*[@id=\"last_name\"]"));
        lastName.sendKeys("Тестовичан");
        WebElement fatherName = driver.findElement(By.xpath("//*[@id=\"father_name\"]"));
        fatherName.sendKeys("Тестович");
        WebElement dateBirth = driver.findElement(By.xpath("//*[@id=\"birth_date\"]"));
        dateBirth.sendKeys("12121997");
        WebElement phoneNumb = driver.findElement(By.xpath("//*[@id=\"phone\"]"));
        phoneNumb.sendKeys("+7 (900) 000-0000");
        WebElement emailField = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        emailField.sendKeys("testaak@gmail.com");
        WebElement agreeWithterms = driver.findElement(By.xpath("//*[@id=\"agree_with_terms\"]"));
        agreeWithterms.click();
        WebElement buttonContinue = driver.findElement(By.xpath("//*[@id=\"first-step\"]/div[3]/button"));
        buttonContinue.click();
        Thread.sleep(1000);
        WebElement userPassport = driver.findElement(By.xpath("//*[@id=\"user-passport_seria_number\"]"));
        userPassport.sendKeys("1123-232132");
        WebElement passportSubvission = driver.findElement(By.xpath("//*[@id=\"passport_subdivision_code\"]"));
        passportSubvission.sendKeys("010-001");
        WebElement birthPlace = driver.findElement(By.xpath("//*[@id=\"passport_birth_place\"]"));
        birthPlace.sendKeys("Москва");
        WebElement userPassissued = driver.findElement(By.xpath("//*[@id=\"user-passport_issued_at\"]"));
        userPassissued.sendKeys("12122020");
        WebElement issueBy = driver.findElement(By.xpath("//*[@id=\"passport_issued_by\"]"));
        issueBy.sendKeys("МВД ПО РЕСП. АДЫГЕЯ");
        WebElement userSalary = driver.findElement(By.xpath("//*[@id=\"user-salary\"]"));
        userSalary.sendKeys("50000");
        WebElement regionField = driver.findElement(By.xpath("//*[@id=\"registration_region\"]"));
        regionField.sendKeys("Москва");
        WebElement cityField = driver.findElement(By.xpath("//*[@id=\"registration_city\"]"));
        cityField.sendKeys("г Москва");
        WebElement streetField = driver.findElement(By.xpath("//*[@id=\"registration_street\"]"));
        streetField.sendKeys("пр-кт Вернадского");
        WebElement numberHouse = driver.findElement(By.xpath("//*[@id=\"registration_housenum\"]"));
        numberHouse.sendKeys("д 4");
        WebElement buttonContin = driver.findElement(By.xpath("//*[@id=\"second-step-submit\"]"));
        buttonContin.click();

    }








}
