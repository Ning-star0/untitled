import java.util.*;
public class ArrayDefine {
    public static int sum(int...numbers){
        int sum=0;
        for(int num:numbers){
            sum+=num;
        }
        return sum;
    }//底层是数组类型(int[] numbers)
    public int[][] initArray(int[][] array){
        Random rand=new Random();
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                //int temp=Math.random(1,6);
                int temp =rand.nextInt(1,7);//左闭右开
                array[i][j]= temp;
            }
        }
        return array;
    }
    public void showArray(int[][] array){
        for(int j=0;j<array.length;j++){
            for(int k=0;k<array[j].length;k++){
                if(array[j][k]==4){
                    System.out.print("*  ");
                }
                else{
                    System.out.print(array[j][k]+"  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int m, n;
        m = 10;
        n = 10;
        int[][] array = new int[m][n];
        ArrayDefine arr = new ArrayDefine();
        System.out.println(sum(1,2,3));
        System.out.println();
        arr.initArray(array);
        arr.showArray(array);
    }
}
