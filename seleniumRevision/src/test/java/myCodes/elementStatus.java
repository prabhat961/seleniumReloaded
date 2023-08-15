package myCodes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class elementStatus {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        WebElement searchBox = driver.findElement(By.id("small-searchterms"));
        //Element is displayed
        System.out.println("is Element displayed:"+searchBox.isDisplayed());
        //Element is enabled
        System.out.println("is Element enabled:"+searchBox.isEnabled());
        //Element is selected
        WebElement Excellent = driver.findElement(By.id("pollanswers-1"));
        WebElement Good = driver.findElement(By.id("pollanswers-2"));
        //Not selected
        System.out.println("is Element selected:"+Excellent.isSelected());
        System.out.println("is Element secelected:"+Good.isSelected());
        //After selecting
        System.out.println("We have selected one radio Button");
        Excellent.click();
        //Selected.
        System.out.println("is Element selected:"+Excellent.isSelected());
        System.out.println("is Element secelected:"+Good.isSelected());



    }
}
