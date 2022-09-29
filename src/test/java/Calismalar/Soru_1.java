package Calismalar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Soru_1 {
    public static void main(String[] args) {
//        1. Yeni bir package olusturalim : day01
//        2. Yeni bir class olusturalim : C03_GetMethods
//        3. Amazon sayfasina gidelim. https://www.amazon.com/
//        4. Sayfa basligini(title) yazdirin
//        5. Sayfa basliginin “Amazon” icerdigini test edin
//        6. Sayfa adresini(url) yazdirin
//        7. Sayfa url’inin “amazon” icerdigini test edin.
//        8. Sayfa handle degerini yazdirin
//        9. Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
//        10. Sayfayi kapatin.

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //3. Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        //4. Sayfa basligini(title) yazdirin
        String titleOfAmazon = driver.getTitle();
        System.out.println("Amazon.com'un basligi= " + titleOfAmazon);

        //5. Sayfa basliginin “Amazon” icerdigini test edin

        if (titleOfAmazon.contains("Amazon")) {
            System.out.println("Baslik testi PASSED");
        } else {
            System.out.println("Baslik testi FAILED");
        }

        //6. Sayfa adresini(url) yazdirin

        String amazonunUrlsi = driver.getCurrentUrl();
        System.out.println("Amazonun URL'i= "+amazonunUrlsi);

        //7. Sayfa url’inin “amazon” icerdigini test edin.

        if (amazonunUrlsi.contains("amazon")){
            System.out.println("Url testi PASSED");
        }else{
            System.out.println("Url testi FAILED");
        }

        //8. Sayfa handle degerini yazdirin
        String amazonunHandle=driver.getWindowHandle();
        System.out.println("Amazonun Handle degeri= "+amazonunHandle);

        //9. Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin

        String amazonKaynakKodlar=driver.getPageSource();
        if (amazonKaynakKodlar.contains("Gateway")){
            System.out.println("Kaynak kod testi PASSED");
        }else {
            System.out.println("Kaynak kod testi FAILED");
        }

        driver.close();
    }
}
