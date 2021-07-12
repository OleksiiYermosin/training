package task7;

public class Student {
    int age;
    String name;
    String group;

    public Student(int age, String name, String group) {
        this.age = age;
        this.name = name;
        this.group = group;
    }

    @Override
    public boolean equals(Object object){
        if(this == object){
            return true;
        }
        if(object == null){
            return false;
        }
        if(object instanceof Student){
            Student temp = (Student) object;
            return this.age == temp.age && this.name.equals(temp.name) && this.group.equals(temp.group);
        }else{
            return false;
        }
    }

    @Override
    public int hashCode(){
        int result = age;
        result = 31 * result + ((name == null) ? 0 : name.hashCode());
        result = 31 * result + ((group == null) ? 0 : group.hashCode());
        return result;
    }

}
