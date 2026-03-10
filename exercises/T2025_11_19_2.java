package exercises;

public class T2025_11_19_2 {
    abstract static class Employee {
        String name;
        String id;
        public Employee(String name, String id) {
            this.name = name;
            this.id = id;
        }
        abstract double calculateSalary();
        abstract String getEmployeeInfo();
    }
    static class FuilTimeEmployee extends Employee {
        double fixedSalary;
        double performanceBonus;
        public FuilTimeEmployee(String name, String id, double fixedSalary, double performanceBonus) {
            super(name, id);
            this.fixedSalary = fixedSalary;
            this.performanceBonus = performanceBonus;
        }
        @Override
        public double calculateSalary() {
            return fixedSalary + performanceBonus;
        }
        @Override
        public String getEmployeeInfo() {
            return "id:" + id + " name:" + name;
        }
    }
    static class PartnTimeEmployee extends Employee {
        double hourlyWage;
        double workhours;
        public PartnTimeEmployee(String name, String id, double hourlyWage, double workhours) {
            super(name, id);
            this.hourlyWage = hourlyWage;
            this.workhours = workhours;
        }
        @Override
        public double calculateSalary() {
            return hourlyWage * workhours;
        }
        @Override
        public String getEmployeeInfo() {
            return "id:" + id + " name:" + name;
        }
    }
    static class ContractEmployee extends Employee {
        double contractAmount;
        int contractMonth;
        public ContractEmployee(String name, String id, double contractAmount, int contractMonth) {
            super(name, id);
            this.contractAmount = contractAmount;
            this.contractMonth = contractMonth;
        }
        @Override
        public double calculateSalary() {
            return contractAmount / contractMonth;
        }
        @Override
        public String getEmployeeInfo() {
            return "id:" + id + " name:" + name;
        }
    }
    static public void show(Employee employee) {
        System.out.println(employee.getEmployeeInfo());
        System.out.println(employee.calculateSalary());
    }
    public static void main(String[] args) {
        Employee[]  employees = new Employee[3];
        employees[0] = new FuilTimeEmployee("zhangsan","E001",500,600);
        employees[1] = new PartnTimeEmployee("lisi","E002",500,600);
        employees[2] = new ContractEmployee("wangwu","E003",500,600);
        for (Employee e : employees) {
            show(e);
        }
    }
}
