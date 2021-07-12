package task7;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testEqualsReflexivity(){
        Student firstObject = new Student(19, "Alexey", "1");
        Student secondObject = firstObject;
        Assert.assertTrue(firstObject.equals(secondObject));
    }

    @Test
    public void testEqualsSymmetry(){
        Student firstObject = new Student(19, "Alexey", "1");
        Student secondObject = new Student(19, "Alexey", "1");
        if(!(firstObject.equals(secondObject)&&secondObject.equals(firstObject))){
            Assert.fail();
        }
    }

    @Test
    public void testEqualsTransitivity(){
        Student firstObject = new Student(19, "Alexey", "1");
        Student secondObject = new Student(19, "Alexey", "1");
        Student thirdObject = new Student(19, "Alexey", "1");
        if((firstObject.equals(secondObject)&&secondObject.equals(thirdObject))&&!firstObject.equals(thirdObject)){
            Assert.fail();
        }
    }

    @Test
    public void testEqualsConsistency(){
        Student firstObject = new Student(19, "Alexey", "1");
        Student secondObject = new Student(19, "Alexey", "1");
        for(int i = 0; i < 1_000_000; i++){
            if(!firstObject.equals(secondObject)){
                Assert.fail();
            }
        }
    }

    @Test
    public void testEqualsOnNull(){
        Student firstObject = new Student(19, "Alexey", "1");
        Assert.assertFalse(firstObject.equals(null));
    }

    @Test
    public void testHashConsistency(){
        Student firstObject = new Student(19, "Alexey", "1");
        int hashCode = firstObject.hashCode();
        for(int i = 0; i < 1_000_000; i++);
        Assert.assertEquals(hashCode, firstObject.hashCode());
    }

    @Test
    public void testHashEquality(){
        Student firstObject = new Student(19, "Alexey", "1");
        Student secondObject = new Student(19, "Alexey", "1");
        Assert.assertEquals(firstObject.hashCode(), secondObject.hashCode());
    }

    @Test
    public void testHashCorrectness(){
        Student firstObject = new Student(19, "Alexey", "1");
        Student secondObject = new Student(19, "Alexey", "2");
        Assert.assertNotEquals(firstObject.hashCode(), secondObject.hashCode());
    }

}
