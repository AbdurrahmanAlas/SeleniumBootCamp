package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_driverMethodlari {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver_win32 (6)/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://amazon.com");
        //acilan sayfanın baslioinin amaozn icerdigini test edin
        String expectedKelime="amazon";
        String actualResult=driver.getTitle();

        if(actualResult.contains((expectedKelime)))



        Thread.sleep(5000);
        driver.close();




    }
}
