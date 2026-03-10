package exercises;

import javax.swing.*;
import java.util.*;

public class DemoStudentGradeManagementSystem {
    private static Scanner input = new Scanner(System.in);
    private static List<String> studentIds=new ArrayList<>();
    private static List<Double>  grades=new ArrayList<>();
    public static void main(String[] args) {
        String[] testIds = {"S01", "S02", "S03", "S04"};
        double[] badGrades = {85.5, -10, 150, 60}; // 第2、3个非法
        addStudentsFromData(testIds, badGrades);
        int choice=0;
        do{
            showMenu();
            try{
                choice=input.nextInt();
                input.nextLine();
                handleChoice(choice);
            }catch(InputMismatchException e){
                System.out.println("请输入正确的1-5");
            }
        }
        while(choice!=5);
    }
    // 用于测试：批量添加（不交互）
    public static void addStudentsFromData(String[] ids, double[] grades) {
        if (ids.length != grades.length) {
            throw new IllegalArgumentException("学号与成绩数量不匹配");
        }
        for (int i = 0; i < ids.length; i++) {
            String id = ids[i];
            double grade = grades[i];

            if (id == null || id.isEmpty()) {
                System.out.println("跳过无效学号: " + id);
                continue;
            }
            if (grade < 0 || grade > 100) {
                System.out.println("成绩无效（" + grade + "），跳过学号: " + id);
                continue;
            }
            studentIds.add(id);
            DemoStudentGradeManagementSystem.grades.add(grade);
            System.out.println("添加: " + id + " -> " + grade);
        }
    }
    private static void showMenu(){
        System.out.println("\n===== 学生成绩管理系统 =====");
        System.out.println("1. 录入学生成绩");
        System.out.println("2. 计算平均分");
        System.out.println("3. 统计及格人数");
        System.out.println("4. 验证学号格式");
        System.out.println("5. 退出系统");
        System.out.print("请选择功能（1-5）：");
    }
    private static void handleChoice(int choice){
        switch(choice){
            case 1:
                addStudent();
                break;
            case 2:
                calculateAverage();
                break;
            case 3:
                countPassingStudents();
                break;
            case 4:
                validateStudentId();
                break;
            case 5:
                System.out.println("正在退出...");
                break;
            default:
                System.out.println("无效选项，请输入 1-5 之间的数字。");
        }
    }
    private static void addStudent(){
        //System.out.println("请输入学生学号(输入-1结束输入)");

        try{
            while(true){
                System.out.println("请输入学生学号(输入-1结束输入)");
                String id=input.nextLine().trim();
                if(id.equals("-1")){
                    break;
                }
                if (id==null||id.isEmpty()) {
                    throw new NullPointerException("学号不能为空！");
                }
                System.out.print("请输入成绩（0-100）: ");
                //id = input.nextLine().trim();
                double grade = input.nextDouble();
                input.nextLine();
                if(grade < 0 || grade > 100){
                    throw new IllegalArgumentException("成绩不合理");
                }
                studentIds.add(id);
                grades.add(grade);
                System.out.println("成功添加学生：" + id + " 成绩：" + grade);
            }
        }catch (NumberFormatException e){
            System.out.println("数字格式错误 "+e.getMessage());
        }catch (NullPointerException e){
            System.out.println("空指针异常：" + e.getMessage());
        }catch(IllegalArgumentException e){
            System.out.println("输入不匹配异常：请输入有效数字作为成绩！");
            input.nextLine();
        }catch(Exception e){
            System.out.println("未知异常"+e);
        }finally{
            System.out.println("录入操作结束");
        }
    }
    private static void calculateAverage() throws IllegalArgumentException{
        try{
            if(grades.isEmpty()){
                throw new ArithmeticException("未录入任何学生数据，无法计算平均分！（分母为0）");
            }
            double total=0;
            for(double item:grades){
                total+=item;
            }
            double avg=total/grades.size();
            System.out.println("平均分:"+avg);
            System.out.println("(3秒后继续...)");
            Thread.sleep(3000);
        }catch (ArithmeticException e){
            System.out.println("算术异常：" + e);
        }catch (Exception e){
            System.out.println("未知异常"+e);
        }finally{
            System.out.println("平均分计算完成。");
        }
    }
    private  static void countPassingStudents(){
        try{
            if(grades.isEmpty()){
                throw new ArithmeticException("未录入任何学生数据，无法计算平均分！（分母为0）");
            }
            int count=0;
            for(double item:grades){
                if(item>=60)
                    count++;
            }
            System.out.println("及格人数：" + count + " 人");
        }catch (ArithmeticException e){
            System.out.println("算术异常：" + e);
        }catch (Exception e){
            System.out.println("未知异常"+e);
        }finally{
            System.out.println("统计完成。");
        }
    }
    private static void validateStudentId(){
        System.out.print("请输入要验证的学号：");
        String id = input.nextLine().trim();
        try {
            if(id==null||id.isEmpty()){
                throw new NullPointerException("学号不能为空");
            }
            long stuid=Long.parseLong(id);
        }catch (NumberFormatException e){
            System.out.println("数字格式异常：" + e.getMessage());
        }catch(NullPointerException e){
            System.out.println("空指针异常：" + e.getMessage());
        }catch (Exception e) {
            System.out.println("其他异常：" + e.getMessage());
        } finally {
            System.out.println("格式验证完成。");
        }
    }
}
