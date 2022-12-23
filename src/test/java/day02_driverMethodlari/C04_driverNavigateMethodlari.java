package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_driverNavigateMethodlari {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver_win32 (6)/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.navigate().to("https://www.amazon.com");
        driver.manage().window().maximize();
        //get ile ayni islevi yapar

        Thread.sleep(3000);
        driver.get("https://wisequarter.com");


        //yeniden amazona dön.
        Thread.sleep(3000);
        driver.navigate().back();

        //Tekrar wise a dön
        driver.navigate().forward();




    }
}
