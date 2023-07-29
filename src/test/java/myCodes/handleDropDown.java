package myCodes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class handleDropDown {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
        WebElement drpdate = driver.findElement(By.name("DateOfBirthDay"));
//        WebElement drpMnth = driver.findElement(By.name("DateOfBirthMonth"));
//        WebElement drpYear = driver.findElement(By.name("DateOfBirthYear"));
        Select date = new Select(drpdate);
//       date.selectByIndex(20);//20
//       date.selectByValue("20");//20
//       date.selectByVisibleText("20");//20

        List<WebElement>tarikh = date.getOptions();
        for (WebElement din: tarikh){
            if (din.getText().equals("17")){
                din.click();
                break;
            }
        }

    }
}
