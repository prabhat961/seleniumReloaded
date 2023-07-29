package myCodes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class openNewTab {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //Open link in new Tab
//        driver.get("https://www.amazon.in/");
//        driver.manage().window().maximize();
//        WebElement mobiles = driver.findElement(By.xpath("//a[normalize-space()='Mobiles']"));
//        String tab = Keys.chord(Keys.CONTROL, Keys.ENTER);
//        mobiles.sendKeys(tab);
        //Open two diff website is two diff tabs
//        driver.get("https://www.amazon.in/");
//        driver.switchTo().newWindow(WindowType.TAB);
//        driver.get("https://www.flipkart.com/");
        //open Diff websites in diff windows
        driver.get("https://www.amazon.in/");
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.flipkart.com/");
    }
}
