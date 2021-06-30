package task3;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestGameModel {
    private static Model model;

    @BeforeClass
    public static void initializeModel() {
        model = new Model();
        model.setPrimaryBounds(0, 5);
    }

    @Test
    public void testRandomGenerator() {
        model.setPrimaryBounds(0, 5);
        int value = model.initializeSecretNumber();
        if (value >= model.getUpperBound() || value <= model.getLowerBound()) {
            Assert.fail();
        }
    }

    @Test
    public void testSetterOfBounds() {
        model.setPrimaryBounds(0, 2);
        if (model.getLowerBound() != 0 || model.getUpperBound() != 2) {
            Assert.fail();
        }
    }

    @Test
    public void testIsGuessed() {
        int value = model.initializeSecretNumber();
        Assert.assertEquals(0, model.isGuessed(value));
    }

    @Test
    public void testIsLess() {
        int value = model.initializeSecretNumber() - 1;
        Assert.assertEquals(2, model.isGuessed(value));
    }

    @Test
    public void testIsBigger() {
        int value = model.initializeSecretNumber() + 1;
        Assert.assertEquals(1, model.isGuessed(value));
    }

    @Test
    public void testLowerBoundGetter() {
        model.setPrimaryBounds(2, 6);
        Assert.assertEquals(2, model.getLowerBound());
    }

    @Test
    public void testUpperBoundGetter() {
        model.setPrimaryBounds(2, 8);
        Assert.assertEquals(8, model.getUpperBound());
    }

    @Test
    public void testLoggerGetter() {
        model.getLog().add(1);
        if (model.getLog().isEmpty()) {
            Assert.fail();
        }
    }

    @Test
    public void testCounterGetter() {
        model.setCounter(5);
        Assert.assertEquals(5, model.getCounter());
    }

}
