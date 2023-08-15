package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvier {
    @Test(dataProvider = "logindata")
    public void loginTest(String email, String pwd){
        System.out.println(email+" "+pwd);
    }
    @DataProvider (name = "logindata")
   public Object[][] getdat(){
       Object[][] data ={ {"abc@example.com","abc"}, {"xyz@example.com","xyz"}, {"123@example.com","123"}};

    return data;
    }
}
