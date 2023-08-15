package excelSelenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class dataDrivenTest {

    WebDriver driver;

    @BeforeClass
    public void setup(){
        System.setProperty("webdriver.chrome.driver","E:\\Software\\Drivers\\Browser Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    @Test(dataProvider = "LoginData")
    public void loginTest(String user, String pwd, String exp){
        driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
        WebElement emailFIeld = driver.findElement(By.xpath(" //input[@id='Email']"));
        emailFIeld.clear();
        emailFIeld.sendKeys(user);
        WebElement passField = driver.findElement(By.xpath("//input[@id='Password']"));
        passField.clear();
        passField.sendKeys(pwd);
        WebElement submitBtn = driver.findElement(By.xpath("//button[@type='submit']"));
        submitBtn.click();

        String expTitle = "Dashboard / nopCommerce administration";
        String actTitle = driver.getTitle();

        if(exp.equals("Valid")) {
            if (expTitle.equals(actTitle)) {
                driver.findElement(By.linkText("Logout")).click();
                Assert.assertTrue(true);
            } else {
                Assert.assertTrue(false);
            }
        }

        else if(exp.equals("InValid")) {
            if (expTitle.equals(actTitle)) {
                driver.findElement(By.linkText("Logout")).click();
                Assert.assertTrue(false);
            } else {
                Assert.assertTrue(true);
            }
        }
    }


     @DataProvider(name = "LoginData")
    public String [][] detData() throws IOException {
//        String loginData[][] = {
//                {"admin@yourstore.com","admin","Valid"},
//                {"admin@yourstore.com",	"1admin1","Invalid"},
//                {"admin@yourstore.com",	"admin2","Invalid"},
//                {"admin@yourstore.com",	"admi",	"Invalid"}
//
//        };
         //get data from excel file

         String path = ".\\dataFiles\\TestData.xlsx";
         XLUtility util = new XLUtility(path);
         int totalRow = util.getRowCount("Sheet1");
         int totalCol = util.getCellCount("Sheet1", 1);
         String loginData[][] = new String[totalRow][totalCol];
         for (int i = 1; i <= totalRow;i++ ){
             for (int j = 0; j < totalCol; j++){
                 loginData[i][j] = util.getCellData("Sheet", i, j);

             }
         }

        return loginData;
     }

     @AfterClass
    public void teerDown(){
        driver.close();
     }




}
