import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestClass {
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Inside before method");
    }
    @Test
    public void firstTest(){
        System.out.println("Inside first Method");
        AddClass addClass = new AddClass();
        int res = addClass.getSum(2,3);
        Assert.assertEquals(5, res);

    }
    @Test
    public void secondTest(){
        System.out.println("This is second test");
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

    public void afterClass(){       // will only execute once
        System.out.println("after class");
    }


}
