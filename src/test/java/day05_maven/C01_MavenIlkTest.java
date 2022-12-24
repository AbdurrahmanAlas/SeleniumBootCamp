package day05_maven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_MavenIlkTest {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //amazon.com a gidelim
        driver.get("https://www.amazon.com/");
        //arama kutusunu locate edelim
        WebElement aramaKutusu= driver.findElement(By.xpath("twotabsearchtextbox"));
        // "SAmsung headphones ile arama yapalım

        aramaKutusu.sendKeys("Samsung headphones" + Keys.ENTER);


    }
}
