package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_ByLinkText {
    public static void main(String[] args) throws InterruptedException {

        //amazon anasayfaya gidin
        // Gift Cards linkini tıklayın
        // Gift Cards sayfasına gittigini tesst edin


        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver_win32 (6)/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");
        Thread.sleep(4000);

        WebElement giftCardLinki=driver.findElement(By.partialLinkText("Gift"));
        giftCardLinki.click();

        //istenen sayfaya gittigini test etmek icin
        //title in Gift Card icerdiğgini test edebilriz

        String expectedKelime="Gift Cards";
        String actualTitle=driver.getTitle();

        if(actualTitle.contains(expectedKelime)){
            System.out.println("Gift cards testi PASSED");
        } else{

            System.out.println("Gift cards testi FAILED");

        }


    }
}
