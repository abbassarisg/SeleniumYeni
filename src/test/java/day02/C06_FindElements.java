package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class C06_FindElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://amazon.com");
//Amazondaki tag'lari link(a) olanlarin sayisini yazdiriniz
        List<WebElement> tag=driver.findElements(By.tagName("a"));

        System.out.println("A taginin sayisi= "+tag.size());

        List<WebElement> tag2=driver.findElements(By.tagName("input"));

        System.out.println("Input taginin sayisi= "+tag2.size());
    }
}
