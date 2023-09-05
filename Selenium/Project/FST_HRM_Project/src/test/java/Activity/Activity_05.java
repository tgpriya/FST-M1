package Activity;
//import org.testng.Assert;
import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Activity_05 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/orangehrm");
        //LOGIN
        driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("orange");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("orangepassword123");
        driver.findElement(By.id("btnLogin")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("menu_pim_viewMyDetails")).click();
        Thread.sleep(3000);
        //Edit steps
        driver.findElement(By.id("btnSave")).click();
        driver.findElement(By.id("personal_txtEmpFirstName")).clear();
        driver.findElement(By.id("personal_txtEmpLastName")).clear();
        driver.findElement(By.id("personal_txtEmpFirstName")).sendKeys("Iksha");
        driver.findElement(By.id("personal_txtEmpLastName")).sendKeys("tg");
        Thread.sleep(3000);
        driver.findElement(By.id("personal_optGender_2")).click();
        driver.findElement(By.id("personal_DOB")).clear();
        Thread.sleep(3000);
        driver.findElement(By.id("personal_DOB")).sendKeys("2022-09-08");
        driver.findElement(By.id("btnSave")).click();
        Thread.sleep(3000);
        driver.close();

        //select.selectByValue("Indian");


    }
}
