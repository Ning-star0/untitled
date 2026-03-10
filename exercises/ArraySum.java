import java.util.*;

public class ArraySum {
    public int sumOfEvenNumbers(int[] arr){
        int sum = 0;
        for(int value:arr){
            if((value&1)==0){
                sum+=value;
            }
        }
        return sum;
    }
    public int findSecondMax(int[] arr){
        Arrays.sort(arr);
        int max=arr[arr.length-1];
        int secondMax=arr[arr.length-1];
        if(arr.length<2){
            System.out.println("数组长度不足");
            return -1;
        }else{
            for(int i=arr.length-2;i>=0;){
                if(arr[i]==max){
                    i--;
                }
                else{
                    secondMax=arr[i];
                    break;
                }
            }
            return secondMax;
        }
    }
    public int[] replaceFirstN(int[] arr, int target, int replacement, int n){
        int n_count=0;
        int[] arrCopy=Arrays.copyOf(arr,arr.length);
        for(int i=0;i<arrCopy.length;i++){
            if(arrCopy[i]==target){
                n_count++;
                arrCopy[i]=replacement;
                if(n_count==n){
                    break;
                }
            }
        }
        return arrCopy;
    }
    public int[] removeFirstOccurrence(int[] arr, int target){
        int index=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                index=i;
                break;
            }
        }
        if(index==-1){
            System.out.println("未找到目标元素：" + target);
            return arr;
        }
        int[] arrCopy=Arrays.copyOf(arr,arr.length-1);
        System.arraycopy(arr,0,arrCopy,0,index);
        System.arraycopy(arr,index+1,arrCopy,index,arr.length-index-1);
        return arrCopy;
    }
    public int[] removeDuplicates(int[] arr){
        int[] temp=new int[arr.length];
        int count=0;
        for(int i=0;i<arr.length;i++){
            boolean exists=false;
            for(int j=0;j<count;j++){
                if(arr[i]==arr[j]){
                    exists=true;
                    break;
                }
            }
            if(!exists){
                temp[count++]=arr[i];
            }
        }
        return Arrays.copyOf(temp,count);
    }
    public static void main(String[] args) {
        int[] arr=new int[5];
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        ArraySum obj=new ArraySum();
        System.out.println("原数组："+Arrays.toString(arr));
        System.out.println("新数组："+Arrays.toString(obj.removeDuplicates(arr)));
    }
}
