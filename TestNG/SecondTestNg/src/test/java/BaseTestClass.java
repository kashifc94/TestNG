import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTestClass {

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Inside before method");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("after method");
        System.out.println();
    }

    @BeforeClass
    public void beforeClass(){         // will only execute once doesnt matter hm test cases/method there are
        System.out.println("before class");
    }
    @AfterClass
    public void afterClass(){       // will only execute once
        System.out.println("after class");
    }



}
