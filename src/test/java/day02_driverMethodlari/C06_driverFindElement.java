package day02_driverMethodlari;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C06_driverFindElement {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver_win32 (6)/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");





        WebElement aramakutusu = driver.findElement(By.id("twotabsearchtextbox"));


        aramakutusu.sendKeys("Java");
        aramakutusu.clear();
        Thread.sleep(3000);


        aramakutusu.sendKeys("nutella");
        aramakutusu.submit();


        Thread.sleep(3000);
        driver.close();

    }
}
