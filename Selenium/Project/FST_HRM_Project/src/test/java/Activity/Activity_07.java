package Activity;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_07 {
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
        driver.findElement(By.xpath("(//a[text()='Qualifications'])[2]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='addWorkExperience']")).click();
driver.findElement(By.id("experience_employer")).sendKeys("IBM1");
driver.findElement(By.id("experience_jobtitle")).sendKeys("Senior");
        driver.findElement(By.xpath("//input[@id='experience_from_date']")).clear();
        driver.findElement(By.xpath("//input[@id='experience_to_date']")).clear();
        Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='experience_from_date']")).sendKeys("2022-01-01");
        driver.findElement(By.xpath("//input[@id='experience_to_date']")).sendKeys("2022-08-01");
Thread.sleep(2000);
driver.findElement(By.id("btnWorkExpSave")).click();
driver.quit();

    }
}