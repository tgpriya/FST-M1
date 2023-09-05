package Activity;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Activity_01 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/orangehrm");
        System.out.println(driver.getTitle());
        String Expected_Website=driver.getTitle();

        Assert.assertEquals(Expected_Website,"OrangeHRM");
        driver.close();
    }
}
