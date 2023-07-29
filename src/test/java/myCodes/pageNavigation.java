package myCodes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pageNavigation {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.get("https://www.amazon.in/");
        //go back to flipkart
        driver.navigate().back();
        //go forward to amazon
        driver.navigate().forward();
        //refresh Amazon
        driver.navigate().refresh();
    }
}
