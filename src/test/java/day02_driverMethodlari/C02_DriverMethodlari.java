package day02_driverMethodlari;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.IdentityHashMap;

public class C02_DriverMethodlari {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver_win32 (6)/chromedriver.exe");
        WebDriver driver=new ChromeDriver();


        //sayfayi tam ekran yapalım
        driver.manage().window().maximize();
        System.out.println("maximize window boyutları" +driver.manage().window().getSize());
        System.out.println("konumu" + driver.manage().window().getPosition());

        Thread.sleep(3000);
        driver.manage().window().fullscreen();
        System.out.println("fullscreen window boyutlari" +driver.manage().window().getSize());

        //browserii istediğimiz konuma ve boyuta getirelim

        driver.manage().window().setPosition(new Point(100,100));
        Thread.sleep(3000);
        driver.manage().window().setSize(new Dimension(300,300));





        Thread.sleep(3000);
        driver.close();

    }
}
