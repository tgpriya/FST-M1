package Activity;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_04 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/orangehrm");
        driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("orange");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("orangepassword123");
        driver.findElement(By.id("btnLogin")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@class='firstLevelMenu']/b[text()='PIM']")).click();
        driver.findElement(By.id("btnAdd")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//input[@class='formInputText'])[1]")).sendKeys("ppp");
        driver.findElement(By.id("lastName")).sendKeys("p");
        driver.findElement(By.xpath("(//input[@type='button'])[4]")).click();

        driver.findElement(By.xpath("//a[@class='firstLevelMenu']/b[text()='PIM']")).click();
        driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys("ppp");
        driver.findElement(By.id("searchBtn")).click();
        Thread.sleep(3000);
        driver.close();




    }
}
