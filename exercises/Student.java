package exercises;

public class Student extends Person implements ISchool{
    int  age;
    String name;
    String major;
    String Clazz;
    double advantageMath;
    double universityEnglish;
    public Student(String name, String gender, int age, String studentId,
                   String major, String clazz, double advantageMath, double universityEnglish) {
        super(name, gender, age);
        this.major = major;
        this.Clazz = clazz;
        this.advantageMath = advantageMath;
        this.universityEnglish = universityEnglish;
    }
    @Override
    public void work() {
        System.out.println("Student works");
    }
    @Override
    public void learn() {
        System.out.println("Student learns");
    }
    @Override
    public void releax() {
        System.out.println("Student releaxes");
    }
    void querySorce(){
        double sum=0;
        sum=this.universityEnglish+this.advantageMath;
    }
    void inyundonghui(){
        System.out.println("学生:"+name+"参加运动会");
    }
    void showSttudent(){
        System.out.println("Student Name:"+name+"Student Major:"+major+"Student Class:"+Clazz);
    }
}
