package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkClass {
    public static void main(String[] args) {
        /*
        En temel haliyle otomasyon yapmak icin Class'imiza Otomasyon icin gerekli olan webdriver'in yerini gostermemiz gerekir
        bunun icin java kutuphanesinde System.setProperty() methodunu kullaniriz
        ve methodun icinde ilk olarak driver i yazariz. ikinci olarak onun fiziki yolunu kopyalariz
         */
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com.tr/");

        System.out.println("driver.getTitle() = " + driver.getTitle());
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
    }
}
