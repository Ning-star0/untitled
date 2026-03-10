package exercises;

public class Teacher extends Person implements ISchool {
    String id;
    String department;
    double salary;
    double subsidy;
    public Teacher(String name, String gender, int age, String id,
                   String department, double salary, double subsidy) {
        super(name, gender, age);
        this.id = id;
        this.department = department;
        this.salary=salary;
        this.subsidy=subsidy;
    }
    @Override
    public void work(){
        System.out.println("Teacher works");
    }
    @Override
    public void learn(){
        System.out.println("Teacher learns");
    }
    @Override
    public void releax(){
        System.out.println("Teacher releaxes");
    }
    void queryS(){
        double total = salary + subsidy;
        System.out.println("Salary + subsidy = " + total);
    }
}
