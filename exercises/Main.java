package exercises;

import java.util.*;
import java.math.*;

public class Main {
    public static int[] initArray(int[] n){
        for(int i=0;i<n.length;i++) {
            n[i] = (int) (Math.random() * 10);
        }
        return n;
    }
    public static void arrayMin(int[] n){
        int min = Integer.MAX_VALUE;
        int number=0;
        for(int i=0;i<n.length;i++) {
            if(n[i]<min) {
                min = n[i];
                number = i;
            }
        }
        System.out.println("index:"+number+" min:"+min);
        //return min;
    }
    public static void arrayMax(int[] n){
        int max = Integer.MIN_VALUE;
        int number=0;
        for(int i=0;i<n.length;i++) {
            if(n[i]>max) {
                max = n[i];
                number = i;
            }
        }
        System.out.println("index:"+number+" max:"+max);
        //return max;
    }
    public static void showArray(int[] n){
        for(int i=0;i<n.length;i++) {
            System.out.print(n[i]+" ");
        }
        System.out.println();
    }
    public static void swap(int[]arr, int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public void bubbleSort(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                swap(arr,j,j+1);
            }
        }
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Main obj=new Main();
        int[] b =new int[20];
        initArray(b);
        obj.bubbleSort(b);
        showArray(b);
        arrayMin(b);
        arrayMax(b);
    }
}