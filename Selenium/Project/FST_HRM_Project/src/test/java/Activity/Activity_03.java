package Activity;
import org.testng.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Activity_03 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/orangehrm");
        driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("orange");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("orangepassword123");
        driver.findElement(By.id("btnLogin")).click();
        Thread.sleep(3000);
        String HomePageTitle=driver.getTitle();
        String ExpectedHometitle="OrangeHRM";
        System.out.println(HomePageTitle);
        Assert.assertEquals(HomePageTitle,ExpectedHometitle);
        driver.close();

    }
}
