package testNG;

import org.testng.annotations.Test;

public class firstTestCase {
    @Test(priority = 1)
    void setup(){
        System.out.println("Open the browser");
    }

    @Test(priority = 2)
    void login(){
        System.out.println("login into the application");
    }

    @Test(priority = 3)
    void teerDown(){
        System.out.println("Close the browser");
    }

    @Test(priority = 4, enabled = false)
    void testfour(){
        System.out.println("This is Fourth Test");
    }


    @Test(priority = 5)
    void testfive(){
        System.out.println("This is Fifth Test");
    }



    @Test(priority = 6)
    void testsix(){
        System.out.println("This is sixth Test");
    }



}
