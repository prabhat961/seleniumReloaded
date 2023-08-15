package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class assertion {
    public static WebDriver driver;

    @BeforeClass
    void setUp(){
        System.setProperty("webdriver.chrome.driver","E:/Software/Drivers/Browser Drivers/chromedriver.exe");
         driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//        driver.manage().window().maximize();
//        WebElement Logo = driver.findElement(By.xpath("//img[@alt='company-branding']"));
//        Assert.assertTrue(Logo.isDisplayed(),"Test Passed");
    }
            @Test(priority = 1)
        void logoTest(){
        System.out.println("driver ="+driver);
       WebElement Logo = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/img[1]"));
        Assert.assertTrue(Logo.isDisplayed(),"Test Passed");
    }

    @Test(priority = 2)
    void titleTest(){
        System.out.println("driver ="+driver);
        String title = driver.getTitle();
        Assert.assertEquals(title, "OrangeHRM");
    }

}


