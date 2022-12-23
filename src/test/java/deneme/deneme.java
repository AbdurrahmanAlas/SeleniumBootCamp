package deneme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class deneme {


    public static void main(String[] args) throws InterruptedException {



        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver_win32 (6)/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("https://kayserihybs.n2mobil.com.tr/accounts/login/?next=/hafriyat/");
        driver.manage().window().maximize();



        WebElement loginuser=driver.findElement(By.id("id_username"));
        loginuser.click();
        loginuser.sendKeys("abdurrahman.alas");

        WebElement loginpassword=driver.findElement(By.id("id_password"));
        loginpassword.click();
        loginpassword.sendKeys("alas2297");

        WebElement enter=driver.findElement(By.xpath("//*[@id=\"login_button\"]"));
        enter.click();
        Thread.sleep(4000);

        WebElement menuBul=driver.findElement(By.linkText("İşletme Modülü"));
        menuBul.click();
        Thread.sleep(2000);

        WebElement firmalistesi=driver.findElement(By.linkText("Firma Listesi"));
        firmalistesi.click();
        Thread.sleep(2000);
        WebElement eye=driver.findElement(By.xpath("//span[@class=\"col-sm-4 text-center no-padding\"]"));
        eye.click();









    }
}
