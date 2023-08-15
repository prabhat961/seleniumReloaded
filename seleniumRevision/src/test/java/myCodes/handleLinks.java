package myCodes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class handleLinks {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        //Ways to Click on Any link
        driver.findElement(By.linkText("New Releases")).click();
        driver.findElement(By.partialLinkText("Releases")).click();;
        //Count and print all the links
        List<WebElement>list= driver.findElements(By.tagName("a"));
        System.out.println("Total No.of links present on the page is:"+list.size());
        for (WebElement links: list){
            System.out.println(links.getText());
            System.out.println(links.getDomAttribute("href"));


        }
    }
}
