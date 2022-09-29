package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_SinifCalismasi {
    public static void main(String[] args) {
        /*
        Main method oluşturun ve aşağıdaki görevi tamamlayın.
        a. http://a.testaddressbook.com adresine gidiniz.
        b. Sign in butonuna basin
        c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        i. Username : testtechproed@gmail.com
        ii. Password : Test1234!
        e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        3. Sayfada kac tane link oldugunu bulun.
         */
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // a. http://a.testaddressbook.com adresine gidiniz.
        driver.get("http://a.testaddressbook.com");

        //b. Sign in butonuna basin
        driver.findElement(By.id("sign-in")).click();

       //c. email textbox,password textbox, and signin button elementlerini locate ediniz.
        WebElement emailTextbox=driver.findElement(By.id("session_email"));
       WebElement password= driver.findElement(By.id("session_password"));
        WebElement signIn= driver.findElement(By.name("commit"));

        //d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:

        emailTextbox.sendKeys("testtechproed@gmail.com");
        password.sendKeys("Test1234!");
        signIn.click();

        //e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify)

        WebElement actualUser= driver.findElement(By.className("navbar-text"));
        if(actualUser.isDisplayed()){
            System.out.println("ActuaUser Testi PASSED==> "+actualUser.getText());
            //Bir Webelementin uzerindeki yaziyi konsolda yazdirabilmek icin getText() methodu kullanilir

        }else System.out.println("ActuaUser Testi FAILED");

        //2. Yolu

        String expectedUserYazisi="testtechproed@gmail.com";


        String actualUserYazisi=actualUser.getText();
        if (actualUserYazisi.equals(expectedUserYazisi)){
            System.out.println("ExpectedId Test PASSED");
        }else {
            System.out.println("ExpectedId Test FAILED");
        }

        // f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        WebElement adresses=driver.findElement(By.linkText("Addresses"));
        WebElement signOut=driver.findElement(By.linkText("Sign out"));
        if (adresses.isDisplayed()){
            System.out.println("Adresses Testi PASSED");
        }else {
            System.out.println("Adresses Testi FAILED");
        }
        if (signOut.isDisplayed()){
            System.out.println("Sign Out Testi PASSED");
        }else {
            System.out.println("Sign Out Testi FAILED");
        }

        //3. Sayfada kac tane link oldugunu bulun.

        List<WebElement> linklerListesi=driver.findElements(By.tagName("a"));
        //linkler a tag'i ile gosterildigi icin ykaridaki gibi yazdik

        System.out.println("Linklerin sayisi= "+linklerListesi.size());

        //4. linkleri yazdirin

        //1. yol
        for (WebElement web:linklerListesi) {
            System.out.println(web.getText());

        }

        //2. yol
        System.out.println();
        System.out.println("=======Lambdayla Cozum========");
        System.out.println();
        linklerListesi.forEach(t-> System.out.println(t.getText()));
        driver.close();
    }
}
