package exercises;

public class Abnormal {
    public  static void main(String args[]) {
        try{
            String str=null;
            System.out.println(str.length());
        }catch(NullPointerException e){
            System.out.println("发生空指针异常！"+e.getMessage());
            e.printStackTrace();
        }
    }
}
