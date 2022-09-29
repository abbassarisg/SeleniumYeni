package Calismalar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Soru_3 {
    public static void main(String[] args) throws InterruptedException {
//        1. Yeni bir class olusturun (TekrarTesti)
//        2. Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını
//        doğrulayın (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
//        3. Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa
//        doğru URL'yi yazdırın.
//        4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/
//        5. Youtube sayfasina geri donun
//        6. Sayfayi yenileyin
//        7. Amazon sayfasina donun
//        8. Sayfayi tamsayfa yapin
//        9. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın,
//                Yoksa doğru başlığı(Actual Title) yazdırın.
//        10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
//        URL'yi yazdırın
//        11.Sayfayi kapati

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://youtube.com");
        String actualTitle=driver.getTitle();
        String expectTitle="youtube";

        if (actualTitle.equals(expectTitle)){
            System.out.println("Baslik testi PASSED");
        }
        System.out.println("Baslik testi FAILED actualTitle===> "+actualTitle);


//        3. Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa
//        doğru URL'yi yazdırın.

        String actualUrl=driver.getCurrentUrl();

        if (actualUrl.contains("youtube")){
            System.out.println("Youtube Url testi PASSED");
        }
        System.out.println("Youtube Url testi FAILED, actualUrl===> "+actualUrl);

        // 4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/

        driver.navigate().to("https://www.amazon.com/");
        Thread.sleep(3000);

        //5. Youtube sayfasina geri donun
        driver.navigate().back();
        Thread.sleep(3000);

        //6. Sayfayi yenileyin
        driver.navigate().refresh();
        Thread.sleep(3000);

        //7. Amazon sayfasina donun
        driver.navigate().forward();
        Thread.sleep(3000);


        //8. Sayfayi tamsayfa yapin
        driver.manage().window().fullscreen();
        Thread.sleep(3000);

        //9. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın,
       // Yoksa doğru başlığı(Actual Title) yazdırın.

       String actualAmazonTitle= driver.getTitle();
       String expectedAmazonTitle="Amazon";
       if (actualAmazonTitle.contains(expectedAmazonTitle)){
           System.out.println("Amazon title testi PASSED");
       }else {
           System.out.println("Amazon titlr testi FAILED, actualAmazonTitle===> "+actualAmazonTitle);
           Thread.sleep(3000);
                 }

        //10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
        //URL'yi yazdırın

       String actualAmazonUrl=driver.getCurrentUrl();
       String expectedAmazonUrl="https://www.amazon.com/";
       if (actualAmazonUrl.equals(expectedAmazonUrl)){
           System.out.println("Amazon Url testi PASSED");
       }else{
           System.out.println("Amazon Url testi FAILED, actulaAmazonUrl===>");
       }

        driver.quit();

    }
}
