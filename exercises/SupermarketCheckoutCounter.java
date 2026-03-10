package exercises;

import jdk.dynalink.beans.StaticClass;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SupermarketCheckoutCounter {
    public static void checkout() throws Exception{
        final double product_price=19.9;
        Scanner input = new Scanner(System.in);
        System.out.println("=== 超市收银台总价计算 ===");
        System.out.println("Enter number of product：");
        try{
            int number=input.nextInt();
            double product_price_sum=0;
            if(number<0){
                throw new IllegalArgumentException();
            }
            product_price_sum=product_price*number;
            System.out.println("SUM:"+product_price_sum);
        }catch(InputMismatchException e){
            System.out.println("请输入整数！");
        }catch (IllegalArgumentException e){
            System.out.println("购买数量不能是负数!!");
        }finally{
            System.out.println("END OF PURCHASE");
            //input.close();
        }
    }
    public static void Demo1(){
        try{
            checkout();
        }catch (Exception e){

        }
    }

    public static void EmployeeAttendanceClockIn(){
        Scanner input = new Scanner(System.in);
        String id= input.next();
        String type=input.next();
        int time= input.nextInt();
        try{
            checkAttendance(id, type, time);
        } catch (IllegalArgumentException e) {
            System.out.println("输入错误: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("系统错误: " + e.getMessage());
        }finally {
            System.out.println("END OF INPUT");
        }
    }
    public static void validateEmpld(String id){
        if(id.length()!=8)
            throw new IllegalArgumentException("请输入8位ID");
        for(char item:id.toCharArray()){
            if(!Character.isDigit(item))
                throw new IllegalArgumentException("请输入8位数字");
        }
        //return true;
    }
    public static void validateCheckTime(String type,int time){
        if(!type.equals("上班")&&!type.equals("下班"))
            throw new IllegalArgumentException("类型错误");
        if (time < 0 || time > 23) {
            throw new IllegalArgumentException("时间应在 0-23 范围内");
        }
        if(time>9&&time<12){
            System.out.println("上班超时");
        }
        if(time>=12&&time<18){
            System.out.println("下班提前");
        }
    }
    public static void checkAttendance(String id,String type,int time) throws Exception{
        validateEmpld(id);
        validateCheckTime(type,time);
    }
    public static void InventorySystem(){
        String productName = "矿泉水";
        int initialStock = 50;
        int currentStock = initialStock;
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("请输入要扣减的库存数量: ");
            int reduceAmount = scanner.nextInt();
            reduceStock(currentStock, reduceAmount);
            System.out.println("扣减成功！当前库存：" + currentStock);

        } catch (IllegalArgumentException e) {
            System.out.println("错误：" + e.getMessage());

        } finally {
            scanner.close();
            System.out.println("操作结束。");
        }
    }
    public static void reduceStock(int currentStock, int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("扣减数量必须大于0");
        }
        if (amount > currentStock) {
            throw new IllegalArgumentException("库存不足，无法扣减" + amount + "件");
        }
    }
    public static void main(String[] args) {
        //Demo1();
        //EmployeeAttendanceClockIn();
        InventorySystem();
    }
}
