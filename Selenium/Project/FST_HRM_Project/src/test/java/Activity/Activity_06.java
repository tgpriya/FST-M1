package Activity;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Activity_06 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/orangehrm");
        //LOGIN
        driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("orange");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("orangepassword123");
        driver.findElement(By.id("btnLogin")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("(//a[@class='firstLevelMenu']/b)[9]")).isDisplayed();
        driver.findElement(By.xpath("(//a[@class='firstLevelMenu']/b)[9]")).isEnabled();
        driver.findElement(By.xpath("(//a[@class='firstLevelMenu']/b)[9]")).click();
        Thread.sleep(3000);
        String ExpectedHeading=driver.findElement(By.xpath("//div[@class='head']/h1")).getText();

        Assert.assertEquals(ExpectedHeading,"Search Directory");
        driver.close();



    }
}
