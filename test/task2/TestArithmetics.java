package task2;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import task2.arithmetics.Arithmetics;

public class TestArithmetics {
    private static Arithmetics a;

    @Rule
    public final ExpectedException exp = ExpectedException.none();

    @Rule
    public Timeout time = new Timeout(1000);

    @BeforeClass
    public static void runT() {
        a = new Arithmetics();
    }

    @Test
    public void testAdd() {
        double res = a.add(3, 7);
        Assert.assertEquals(res, 10.0, 0.000001);
    }

    @Test
    public void testMult() {
        double res = a.mult(3, 7);
        Assert.assertEquals(res, 21.0, 0.000001);
    }

    @Test
    public void testDeduct() {
        double res = a.deduct(3, 7);
        Assert.assertEquals(res, -4.0, 0.000001);
    }

    @Test
    public void testDivide() {
        double res = a.div(10, 5);
        Assert.assertEquals(res, 2.0, 0.000001);
    }

    //@Test(expected = ArithmeticException.class)
    @Test
    public void testDivException() {
        exp.expect(ArithmeticException.class);
        a.div(10, 0);
    }

    //@Test(timeout = 1000)
    @Test
    public void testN() {
        a.div(10.0, 10.0);
    }

}
