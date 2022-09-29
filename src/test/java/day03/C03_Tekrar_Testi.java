package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class C03_Tekrar_Testi {
    /*

    a. web sayfasına gidin. https://www. amazon.com/
    b. Search(ara) “city bike”
    c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
    e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın
  */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));



        //a. web sayfasına gidin. https://www. amazon.com/

        driver.get("https://www.amazon.com/");

        WebElement aramKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramKutusu.sendKeys("city bike", Keys.ENTER);

        // WebElement aramaSonucu=driver.findElement(By.className());

        List<WebElement> aramaSonucu = driver.findElements(By.className("sg-col-inner"));
        String sonucYazisi = aramaSonucu.get(0).getText();
        System.out.println(sonucYazisi);

        //sadece sonuc sayisini yazdirin


        String[] sonucYazisiE = sonucYazisi.split(" ");
        System.out.println("City Bike arama sonucu = " + sonucYazisiE[2]);

        //Sonuc yazisini LAMBDA ile yazdirin

        Arrays.stream(sonucYazisi.split(" ")).limit(3).skip(2).forEach(System.out::println);


        // e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın
        List<WebElement> ilkresim = driver.findElements(By.className("s-image"));

        WebElement ilkResimWE = ilkresim.get(0);
        ilkResimWE.click();
        driver.close();


    }
}
