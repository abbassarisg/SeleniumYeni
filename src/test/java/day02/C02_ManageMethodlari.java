package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_ManageMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        /*
        Yeni bir Class olusturalim.
        C06_ManageWindow Amazon soyfasina gidelim. https://www.amazon.com/
Sayfanin konumunu ve boyutlarini yazdirin Sayfayi simge durumuna getirin simge durumunda 3 saniye
bekleyip sayfayi maximize yapin Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
Sayfayi fullscreen yapin  Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin Sayfayi kapatin
         */

        driver.get("https://www.amazon.com/");
//Sayfanin  konumu ve boyutlarini yazdir
        System.out.println("Pencere konumu= "+driver.manage().window().getPosition()); //Acilan browser in konumunu verir
        System.out.println("Pencere olculeri= "+ driver.manage().window().getSize()); //Acilan browserin olculerini verir

        //Sayfayi simge durumuna getir
        driver.manage().window().minimize();

        //Simge durumunda 3 saniye bekledikten sonra maximize et

        Thread.sleep(3000);
        driver.manage().window().maximize();

        //Sayfanin konumunu ve boyutunu maximize de yazdir

        System.out.println("Yeni Pencere Konumu = " + driver.manage().window().getPosition());
        System.out.println("Yeni Pencere  Olculeri= " + driver.manage().window().getSize());

        Thread.sleep(3000);
        driver.manage().window().fullscreen();
        //Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        System.out.println("Fullscreen Pencere konumu = "+driver.manage().window().getPosition());
        System.out.println("Fullscreen Pencere olculeri = "+driver.manage().window().getSize());
        //Sayfayi kapatin
        Thread.sleep(3000);
        driver.close();
    }
}
