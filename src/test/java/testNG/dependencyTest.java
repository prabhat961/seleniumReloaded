package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependencyTest {

    @Test
    void startCar(){
        System.out.println("Car is started");
        Assert.fail();
    }

    @Test(dependsOnMethods = {"startCar"})
    void driveCar(){
        System.out.println("Car is driving");
    }

    @Test(dependsOnMethods = {"driveCar"})
    void stopCar(){
        System.out.println("Car is stopped");
    }

    @Test(dependsOnMethods = {"driveCar","stopCar"}, alwaysRun = true)
    void parkCar(){
        System.out.println("Car is parked");
    }
}
