package Activity;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Activity_09 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/orangehrm");
        //LOGIN
        driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("orange");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("orangepassword123");
        driver.findElement(By.id("btnLogin")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@class='firstLevelMenu']/b[text()='My Info']")).click();
driver.findElement(By.xpath("//a[text()='Emergency Contacts']")).click();
        Thread.sleep(3000);
        List<WebElement> row = driver.findElements(By.xpath("//table[contains(@id, 'emgcontact_list')]/tbody/tr"));
        System.out.println(row.size());
        List<WebElement> Col=driver.findElements(By.xpath("//table[contains(@id, 'emgcontact_list')]/tbody/tr[1]/td"));
        System.out.println(Col.size());

        List<WebElement> phonenumber=driver.findElements(By.xpath("//table[contains(@id, 'emgcontact_list')]/tbody/tr/td[5]"));
        for(WebElement cell : phonenumber) {
            System.out.println("The phone number are :"+ cell.getText());
        }
        driver.quit();

    }
    }
