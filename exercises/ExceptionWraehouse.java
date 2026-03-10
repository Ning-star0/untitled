package exercises;

import java.util.Scanner;

public class ExceptionWraehouse {
    //class invadlid ex
    public static void Demo1(String username){
        if(username.length()<8){
            throw new IllegalArgumentException("长度太短");
        }
        for(char itme:username.toCharArray()){
            if (!(Character.isLetter(itme) || Character.isDigit(itme))) {
                throw new IllegalArgumentException("内容不合法");
            }
        }
        System.out.println("ok");
    }
    public static void main(String[] args) {
        String username="123456789";
        try{
            Demo1(username);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
