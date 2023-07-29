package myCodes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class javScriptExecutor {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();

        //Syntax
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript(Script, args);

        WebElement Logo = driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
        JavaScriptUtil.drawBorder(Logo, driver);

        String tittle = JavaScriptUtil.getTitleByJS(driver);
        System.out.println(tittle);

    }
}
