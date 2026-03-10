package exercises;
import java.io.*;
public class FileDemo {
    public static void main(String[] args )throws IOException {
        File file=new File("file.txt");
        File dir=new File("dir");
        if(!file.exists()){
            boolean created=file.createNewFile();
            System.out.println("以创建"+created);
        }
        if(!dir.exists()){
            dir.mkdir();
        }
        System.out.println("绝对路径: " + file.getAbsolutePath());
        System.out.println("是否可写: " + file.canWrite());
        System.out.println("文件大小: " + file.length() + " bytes");

    }
}
