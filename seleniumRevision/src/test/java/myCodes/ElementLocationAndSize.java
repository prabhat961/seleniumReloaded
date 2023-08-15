package myCodes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ElementLocationAndSize {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        WebElement Logo = driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));

        //Location Method 1:
        System.out.println("Location(x, y):"+Logo.getLocation());
        System.out.println("Location of x:"+Logo.getLocation().getX());
        System.out.println("Location of Y:"+Logo.getLocation().getY());

        //Location Method 2:
        System.out.println("Location of x:"+Logo.getRect().getX());
        System.out.println("Location of Y:"+Logo.getRect().getY());

        //Size Method 1:
        System.out.println("Size(Width, Hieght):"+Logo.getSize());
        System.out.println("Width of Element:"+Logo.getSize().width);
        System.out.println("Hieght of ELement:"+Logo.getSize().height);

        //SIze Method 2:
        System.out.println("Width of Element:"+Logo.getRect().getDimension().width);
        System.out.println("Hieght of ELement:"+Logo.getRect().getDimension().height);


driver.close();
    }
}
