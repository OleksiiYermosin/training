package task7;

public final class ImmutableClass{

    private final String name;
    private final MutableClass object;

    public ImmutableClass(String name, MutableClass object){
        MutableClass clonedObject = new MutableClass();
        clonedObject.setData(object.getData());
        this.object = clonedObject;
        this.name = name;
    }

    public ImmutableClass setName(String name){
        return new ImmutableClass(name, this.object);
    }

    public ImmutableClass setObject(MutableClass object){
        return new ImmutableClass (this.name, object);
    }

    public String getName(){
        return this.name;
    }

    public MutableClass getObject(){
        MutableClass clonedObject = new MutableClass();
        clonedObject.setData(this.object.getData());
        return clonedObject;
    }

}
