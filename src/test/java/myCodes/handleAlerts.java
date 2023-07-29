package myCodes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class handleAlerts {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //basic auth:
        //driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        //driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.get("https://www.redbus.in/");
        driver.manage().window().maximize();
        //click OK Button
//        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
//        Thread.sleep(3000);
//        driver.switchTo().alert().accept();
        //CLick Cancel Button
//        driver.findElement(By.xpath(" //button[@onclick='jsConfirm()']")).click();
//        Thread.sleep(3000);
//        driver.switchTo().alert().dismiss();
        //Alert Window with input box
//        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
//        Alert alertWindow = driver.switchTo().alert();
//        System.out.println("Text in the window is:"+alertWindow.getText());
//        alertWindow.sendKeys("This is Prabhat");
//        alertWindow.accept();
    }
}
