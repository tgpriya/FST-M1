package Activity;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_02 {

    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/orangehrm");
        System.out.println(driver.getTitle());
        WebElement img = driver.findElement(By.xpath("//div[@id='divLogo']/img"));
        System.out.println("Src attribute is: " + img.getAttribute("src"));
        driver.close();
    }
}
