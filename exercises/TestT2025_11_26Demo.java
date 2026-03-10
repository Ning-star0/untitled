package exercises;

public class TestT2025_11_26Demo {
    public static void main(String[] args) {
        Student student=new Student("张三", "男", 20, "S001", "计算机科学", "2023级1班", 85.5, 78.0);
        Teacher teacher=new Teacher("李四", "女", 35, "T001", "计算机系", 8000.0, 2000.0);
        System.out.println("=== 学生行为 ===");
        student.work();
        student.learn();
        student.releax();
        student.querySorce();
        student.inyundonghui();
        student.showSttudent();
        System.out.println("\n=== 教师行为 ===");
        teacher.work();
        teacher.learn();
        teacher.releax();
        teacher.queryS();
    }
}
