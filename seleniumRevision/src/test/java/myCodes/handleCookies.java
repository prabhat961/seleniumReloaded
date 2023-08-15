package myCodes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class handleCookies {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        //Capture All cookiess
        Set<Cookie>cookies = driver.manage().getCookies();
        System.out.println("Number of cookies on the page is:"+cookies.size());
        //Print cookie information
        for(Cookie cook:cookies){
            System.out.println(cook.getName()+"  "+cook.getValue());
        }
        //Add cookie

        Cookie cookieobj = new Cookie("xyz123", "123456");
         driver.manage().addCookie(cookieobj);
        cookies = driver.manage().getCookies();
        System.out.println("Number of cookies after adding this:"+cookies.size());
        //delete cookies
        driver.manage().deleteCookie(cookieobj);
        cookies = driver.manage().getCookies();
        System.out.println("Number of cookies after after deletion:"+cookies.size());
        driver.quit();



    }
}
