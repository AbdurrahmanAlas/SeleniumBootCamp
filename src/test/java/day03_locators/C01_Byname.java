package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Byname {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver_win32 (6)/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");
        WebElement aramakutusu=driver.findElement(By.name("field-keywords"));

        aramakutusu.sendKeys("Nutella" + Keys.ENTER);

    }
}
