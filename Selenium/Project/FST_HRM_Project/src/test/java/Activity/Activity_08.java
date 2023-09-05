package Activity;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Activity_08 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/orangehrm");
        //LOGIN
        driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("orange");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("orangepassword123");
        driver.findElement(By.id("btnLogin")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@class='firstLevelMenu']/b[text()='Dashboard']")).click();
        driver.findElement(By.xpath("//span[text()='Apply Leave']")).click();
        Thread.sleep(3000);
//        WebElement dropdown=driver.findElement(By.xpath("//select[@name='applyleave[txtLeaveType]']"));
//        Select s1=new Select(dropdown);
//        // Get all the options inside the select as a list
//        List<WebElement> options=s1.getOptions();
//       s1.selectByValue("DayOff");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@id='applyleave_txtFromDate']")).clear();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='applyleave_txtFromDate']")).sendKeys("2022-08-10");
        driver.findElement(By.xpath("//input[@id='applyleave_txtToDate']")).clear();
        driver.findElement(By.xpath("//input[@id='applyleave_txtToDate']")).sendKeys("2022-08-11");
        Thread.sleep(2000);
        driver.findElement(By.id("applyBtn")).click();
        driver.findElement(By.xpath("//input[@id='calFromDate']")).clear();
        driver.findElement(By.xpath("//input[@id='applyleave_txtToDate']")).clear();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='calFromDate']")).sendKeys("2022-08-01");
        driver.findElement(By.xpath("//input[@id='calToDate']")).sendKeys("2022-08-02");
        Thread.sleep(2000);
        driver.findElement(By.id("btnSearch"));
       driver.close();
    }

    }
