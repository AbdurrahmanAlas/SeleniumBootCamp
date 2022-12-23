package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_driverMethodlari {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver_win32 (6)/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.com");



        //pageSource un MEOW içerdigini test edin

        String pageSource=driver.getPageSource();
        String expectedKelime="MEOW";

        if(pageSource.contains(expectedKelime)){

            System.out.println("page source testi passed");

        }
        else {
            System.out.println("page source testi failed, MEOW kelimesi bulunamadı.");
        }



    }
}
