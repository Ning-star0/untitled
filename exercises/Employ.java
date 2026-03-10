package exercises;

import java.util.Objects;

public class Employ {
    class Employee{
        private String id;
        private String name;
        private String dept;
        private  double salary;
        Employee(String id,String name,String dept,double salary){
            this.id=id;
            this.name=name;
            this.dept=dept;
            this.salary = salary;
        }
        public String getId(){
            return id;
        }
        public String getName(){
            return name;
        }
        public String getDept(){
            return dept;
        }
        public double getSalary(){
            return salary;
        }
    }
    private Employee[] employees=new Employee[8];
    public void initEmployees(){
        employees[0] = new Employee("001", "白星", "技术部", 8000.0);
        employees[1] = new Employee("002", "李雷", "市场部", 7500.0);
        employees[2] = new Employee("003", "韩梅梅", "技术部", 7200.0);
        employees[3] = new Employee("004", "小明", "人事部", 6800.0);
        employees[4] = new Employee("005", "小红", "市场部", 7700.0);
        employees[5] = new Employee("006", "小刚", "技术部", 8100.0);
    }
    public double totalSalary(String deptName){
        double total=0;
        boolean deptExists=false;
        for(Employee e:employees){
            if(e!=null&&Objects.equals(e.getSalary(),deptName)){
                total+=e.getSalary();
                deptExists=true;
            }
        }
        if(!deptExists){
            System.out.println("不存在此部门");
            return -1;
        }
        return total;
    }
    public Employee hightestSalarys(String deptname){
        Employee hight=null;
        //double maxSalary=employees[0];
        for(Employee e:employees){
            if(e!=null&&Objects.equals(e.getDept(),deptname)){
                if(hight==null||hight.getSalary()<e.getSalary()){
                    hight=e;
                }
            }
        }
        if(hight==null){
            System.out.println("不存在此部门");
        }
        return hight;
    }
    public static void main(String[] arg){
        Employ employ=new Employ();
        Employee[] employees = new Employee[3];
        employees[0] = employ.new Employee("001", "白星", "开发部", 8000.0);
        employees[1] = employ.new Employee("002", "李雷", "市场部", 7500.0);
        employees[2] = employ.new Employee("003", "韩梅梅", "开发部", 7200.0);

    }
}
