package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_GetMethodlari {
    public static void main(String[] args) {
        /*
        Amazon sayfasina gidiniz
        Arama kutusunu locate ediniz
        Arama kutusunu tagName' nin input oldugunu test ediniz
        Arama kutusunun name attirbute nu degerinin field-keywords oldugunu test ediniz
        sayfayi kapatiniz
         */
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        //Amazon sayfasina gidiniz
        driver.get("https://amazon.com");

        //Arama kutusunu locate ediniz
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));


        //Arama kutusunu tagName' nin input oldugunu test ediniz
        String expectedTagname="input";
        String actualTagname=aramaKutusu.getTagName();


        if (actualTagname.equals(expectedTagname)){
            System.out.println("Tagname test PASSED");
        }else {
            System.out.println("Tagname test FAILED");
        }

        //Arama kutusunun name attirbute nu degerinin field-keywords oldugunu test ediniz

        String expectedAttributeName="field-keywords";
        String actualAttributeName=aramaKutusu.getAttribute("name");

        if (actualAttributeName.equals(expectedAttributeName)){
            System.out.println("Attribute Test PASSED");
        }else {
            System.out.println("Attribute Test FAILED");
        }

        //Arama kutusunu konumunu yazdirin

        System.out.println("Arama kutusu Konumu = " + aramaKutusu.getLocation());


    }
}
