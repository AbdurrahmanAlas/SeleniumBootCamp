package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class driverManageMethodlari {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver_win32 (6)/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // implicitly wait gittigimiz sayfa acilincaya veya aradigimiz webelement bulununcaya kadar
        // driver'in bekleyebilecegi max sureyi belirler

        // Bu dortlu her test method'unun basina yazilacak
    }
}
