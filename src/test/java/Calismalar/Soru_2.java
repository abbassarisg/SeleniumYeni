package Calismalar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Soru_2 {
    public static void main(String[] args) throws InterruptedException {

//        1. Yeni bir Class olusturalim.C05_NavigationMethods
//        2. Youtube ana sayfasina gidelim . https://www.youtube.com/
//        3. Amazon soyfasina gidelim. https://www.amazon.com/
//        4. Tekrar YouTube’sayfasina donelim
//        5. Yeniden Amazon sayfasina gidelim
//        6. Sayfayi Refresh(yenile) yapalim
//        7. Sayfayi kapatalim / Tum sayfalari kapatalim

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();


        //2. Youtube ana sayfasina gidelim . https://www.youtube.com/
        driver.get("https://www.youtube.com/");
        Thread.sleep(3000);

        // 3. Amazon soyfasina gidelim. https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com/");
        Thread.sleep(3000);

        //4. Tekrar YouTube’sayfasina donelim
        driver.navigate().back();
        Thread.sleep(3000);

        //5. Yeniden Amazon sayfasina gidelim
        driver.navigate().forward();
        Thread.sleep(3000);

        //6. Sayfayi Refresh(yenile) yapalim
        driver.navigate().refresh();
        Thread.sleep(3000);

        //7. Sayfayi kapatalim / Tum sayfalari kapatalim
        driver.close();
        driver.quit();
    }
}
