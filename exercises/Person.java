package exercises;

public abstract class Person{
    protected String name;
    protected String gender;
    protected int age;
    public Person(String name,String gender,int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    public abstract void work();
    public abstract void learn();
    public abstract void releax();
}
