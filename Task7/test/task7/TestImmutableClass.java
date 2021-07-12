package task7;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestImmutableClass {
    public static MutableClass mutableObject;

    @BeforeClass
    public static void initializeTest(){
        mutableObject = new MutableClass();
        mutableObject.setData(17);
    }

    @Test
    public void testNameGetter(){
        ImmutableClass immutableObject = new ImmutableClass("First object", mutableObject);
        String name = immutableObject.getName();
        name = new String("Not first object");
        Assert.assertEquals(immutableObject.getName(), "First object");
    }

    @Test
    public void testObjectGetter(){
        ImmutableClass immutableObject = new ImmutableClass("First object", mutableObject);
        MutableClass object = immutableObject.getObject();
        object.setData(3);
        Assert.assertEquals(immutableObject.getObject().getData(), 17);
    }

    @Test
    public void testNameSetter(){
        ImmutableClass immutableObject = new ImmutableClass("First object", mutableObject);
        immutableObject.setName("Second object");
        if(immutableObject.getName().equals("Second object")||immutableObject.getObject().getData()!=17){
            Assert.fail();
        }
    }

    @Test
    public void testObjectSetter(){
        ImmutableClass immutableObject = new ImmutableClass("First object", mutableObject);
        immutableObject.setObject(new MutableClass());
        if(!immutableObject.getName().equals("First object")||immutableObject.getObject().getData()!=17){
            Assert.fail();
        }
    }

}
