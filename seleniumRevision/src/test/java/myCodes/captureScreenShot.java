package myCodes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class captureScreenShot {
    public static void main(String[] args) throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        //Full Psge ScreenShot
        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File trg = new File(".\\ScreenShots\\FullPage.png");
        FileUtils.copyFile(src, trg);

        //Section ScreenShot or specific element ScreenShot
        WebElement LogoSection = driver.findElement(By.xpath("//img[@alt='Google']"));
        File src1 = LogoSection.getScreenshotAs(OutputType.FILE);
        File trg1 = new File(".\\ScreenShots\\GoogleLogo.png");
        FileUtils.copyFile(src1, trg1);





    }
}
