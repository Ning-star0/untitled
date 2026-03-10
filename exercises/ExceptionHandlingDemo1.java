package exercises;

import java.io.*;
import java.util.*;
public class ExceptionHandlingDemo1 {
    public static void readFirstLine(String filename) throws IOException {
        try(BufferedReader br=new BufferedReader(new FileReader(filename))){
            System.out.println(br.readLine());
        }
    }
    public static void calculateSquareRoot(double x){
        if(x<0){
            //throw NegativeArraySizeException;
        }
    }
    public static void Demo1(){
        Scanner sc = new Scanner(System.in);
        try{

            int a=sc.nextInt();
            int b=sc.nextInt();
            int c= a /b;
            System.out.println(c);

        }catch (InputMismatchException e){
            System.out.println("输入的值应该是两个整数:"+e);
        }catch(ArithmeticException e){
            System.out.println("分母不能是除数:"+e);
        }finally{
            System.out.println("算术运算资源释放");
        }
    }
    public static void Demo2(){
        try{
            readFirstLine("C:\\Users\\n2356\\IdeaProjects\\untitled\\src\\exercises\\text.txt");
        }catch(IOException e){
            System.out.println(e);
        }
    }
    public static void Demo3(){
        try{
            int[] arr=new int[]{10,20,30};
            arr[3]=3;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("合法下标范围0-2 "+e);
        }finally{
            System.out.println("array operating");
        }
    }
    public static void Demo4(){
        try{
            String str=null;
            str.length();
        }catch(NullPointerException e){
            System.out.println("空指针异常\n"+e);
            //e.printStackTrace();
        }finally{
            System.out.println("字符串操作结束");
        }
    }
    public static void InputMismatchException(){
        Scanner scanner = new  Scanner(System.in);
        try{
            int num1=scanner.nextInt();
            int num2=scanner.nextInt();
        }catch(NullPointerException e){
            System.out.println("空指针异常\n"+e);
            //e.printStackTrace();
        }catch(InputMismatchException e){
            System.out.println("数字类型错误\n"+e);
            scanner.nextLine();
        }
        finally{
            System.out.println("输入流结束");
        }
    }
    public static void Demo5(){
        String str1="123xyz";
        String str2="456";
        try{
            int num1=Integer.parseInt(str1);
            int num2=Integer.parseInt(str2);
        }catch(NumberFormatException e){
            System.out.println("类型转换错误\n"+e);
        }catch(Exception e){
            System.out.println("其他异常\n"+e);
        }
        finally{
            System.out.println("字符串转数字操作完成");
        }
    }
    public static void main(String[] args) {
        //Demo1();
        //Demo2();
        //Demo3();
        //Demo4();
        //InputMismatchException();
        Demo5();
    }
}
