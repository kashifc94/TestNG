import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestClass extends BaseTestClass{

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





}
