package exercises;

import java.util.*;

public class InheritanceStudent {
    static class People{
        String name;
        int age;
        People(){
            this.name="";
            this.age=0;
        }
        void eating(){
            System.out.println(name+" is eating");
        }
        void sleeping(){
            System.out.println(name+" is sleeping");
        }
        void setName(String name){
            this.name=name;
        }
        void setAge(int age){
            this.age=age;
        }
        void showName(){
            System.out.println(name+" is showing");
        }
        void showAge(){
            System.out.println(this.name+this.age);
        }
    }
    static class Students extends People{
        Students(){
            super();
        }
    }
    static class Teachers extends People{
        double salary;
        Teachers(){
            super();
            this.salary=0.0;
        }
        void  setSalary(double salary){
            this.salary=salary;
        }
        void showSalary(){
            System.out.println(this.name+this.salary);
        }
        @Override
        void eating(){
            System.out.println(name+" teachers is eating");
        }
    }
    static class HomeroomTeacher extends Teachers{
        HomeroomTeacher(){
            super();
        }
        @Override
        void eating(){
            System.out.println(name+" homeroom teacher is eating");
        }
    }
    public static void main(String args[]){
        //InheritanceStudent obj=new InheritanceStudent();
        Students student1=new Students();
        student1.setAge(18);
        student1.setName("nxk");
        student1.showName();
        student1.eating();
        student1.sleeping();
        Teachers t1=new Teachers();
        t1.setName("李四");
        t1.setAge(19);
        t1.setSalary(10000.2);
        t1.showName();
        t1.showAge();
        t1.showSalary();
        t1.eating();
        t1.sleeping();
        HomeroomTeacher h1=new HomeroomTeacher();
        h1.setAge(18);
        h1.setName("wanh");
        h1.setSalary(106.84);
        h1.showName();
        h1.showAge();
        h1.showSalary();
        h1.eating();
        h1.sleeping();
    }
}
