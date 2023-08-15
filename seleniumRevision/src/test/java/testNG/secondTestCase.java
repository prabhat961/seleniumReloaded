package testNG;


import org.testng.Assert;
import org.testng.annotations.Test;

public class secondTestCase {
    @Test(priority = 1)
    void addCustomer(){
        System.out.println("Customer added sucesfully");
    }

    @Test(priority = 2)
    void searchCustomer(){
        System.out.println("Customer Found");
        Assert.assertEquals(1, 2);
    }

    @Test(priority = 3)
    void deleteCustomer(){
        System.out.println("Customer deleted sucesfully");
    }
}
