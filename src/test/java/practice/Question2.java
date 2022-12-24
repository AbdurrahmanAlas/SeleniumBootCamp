package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Question2 {

    public static void main(String[] args) throws InterruptedException {


        // 1  Driver olusturalim
        WebDriverManager.chromedriver().setup();
        // 2  Java class'imiza chromedriver.exe'yi tanitalim
        WebDriver driver = new ChromeDriver();
        // 3  Driver'in tum ekrani kaplamasini saglayalim
        driver.manage().window().maximize();
        // 4  Driver'a sayfanın yuklenmesini 10.000 milisaniye (10 saniye) boyunca beklesini
        //    söyleyelim. Eger oncesinde sayfa yuklenirse, beklemeyi bıraksin.
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // 5  "https://www.otto.de" adresine gidelim
        driver.get("https://www.otto.de");
        // 6  Bu web adresinin sayfa basligini (title) ve adres (url)ini alalim
        // 7  Title ve url'nin "OTTO" kelimesini icerip icermedigini kontrol edelim
        String titleOtto = driver.getTitle();
        String urlOtto = driver.getCurrentUrl();
        String expectedKelime = "OTTO";

        if (titleOtto.contains(expectedKelime)) {
            System.out.println("Otto testi passed");
        } else {
            System.out.println("otto testi failed");
        }
        if(urlOtto.contains(expectedKelime)){
            System.out.println("ottourl testi passed");
        }
        else {
            System.out.println("ottourl testi failed");
        }
        // 8  Ardindan "https://wisequarter.com/" adresine gidelim

        driver.navigate().to("https://wisequarter.com/");
        // 9  Bu adresin basligini ve Url alalim ve "Quarter" kelimesini icerip icermedigini
        //    kontrol edelim
        String titleQuarter = driver.getTitle();
        String titleUrl = driver.getCurrentUrl();
        String expectedKelime2 = "Quarter";

        if (titleQuarter.contains(expectedKelime2)) {

            System.out.println("Quarter passed");
        } else {
            System.out.println("Quarter failed");
        }

        if(urlOtto.contains(expectedKelime)){
            System.out.println("passed");
        }
        else {
            System.out.println("failde");
        }

        // 10 Bir onceki web sayfamiza geri donelim
        driver.navigate().back();
        // 11 Sayfayi yenileyelim
        driver.navigate().refresh();
        // 12 Daha sonra web sayfamiza tekrar donelim ve oldugumuz sayfayi kapatalim
        driver.navigate().forward();
        driver.quit();
        // 13 En son adim olarak butun sayfalarimizi kapatmis olalim



    }


}
