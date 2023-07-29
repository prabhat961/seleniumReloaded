package myCodes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class searchENgine {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        WebElement serBox = driver.findElement(By.id("APjFqb"));
        serBox.sendKeys("Java");
        Thread.sleep(3000);
        List<WebElement>list = driver.findElements(By.xpath("//li[@class='sbct']//div[@role='option']//div[1]/span"));
        System.out.println("No. of options available:"+list.size());
        for (WebElement sugg : list ){
            if (sugg.getText().contains("tutorial")){
                sugg.click();
                break;
            }
        }
    }
}
//li[@class='sbct']//div[@role='option']//div[1]/span
//ul[@class="G43f7e"]//li[3]