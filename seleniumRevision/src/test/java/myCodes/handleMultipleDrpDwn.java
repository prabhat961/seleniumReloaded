package myCodes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class handleMultipleDrpDwn {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
        WebElement drpdate = driver.findElement(By.name("DateOfBirthDay"));
        selectOptionFromDropDown(drpdate, "17");
        WebElement drpMnth = driver.findElement(By.name("DateOfBirthMonth"));
        selectOptionFromDropDown(drpMnth, "November");
        WebElement drpYear = driver.findElement(By.name("DateOfBirthYear"));
        selectOptionFromDropDown(drpYear, "1989");
    }

    public static void selectOptionFromDropDown(WebElement ele, String Value) {
        Select drp = new Select(ele);
        List<WebElement> tarikh = drp.getOptions();
        for (WebElement din : tarikh) {
            if (din.getText().equals(Value)) {
                din.click();
                break;

            }
        }
    }
}
