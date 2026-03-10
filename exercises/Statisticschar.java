import java.awt.datatransfer.StringSelection;
import java.util.*;

public class Statisticschar {


    public static void main(String[] args) {
        int count=0;
        int daxie=0;
        int xiaoxie =0;
        int number=0;
        int spe=0;
        //final String str1="this is a test of java";
        final String str1="abc92872345@#@@#% %#@!^~MMZZyydd";
        char[] charstr1=str1.toCharArray();
        for(char item:charstr1){
            if(Character.isUpperCase(item)){
                daxie++;
            }else if(Character.isLowerCase(item)){
                xiaoxie++;
            }else if(Character.isDigit(item)){
                number++;
            }else{
                spe++;
            }
        }
        //System.out.println(count);
        System.out.println("数字"+number);
        System.out.println("daxie"+daxie);
        System.out.println("xiaoxie"+xiaoxie);
        System.out.println("特殊"+spe);
    }

}
