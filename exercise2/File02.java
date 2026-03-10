package exercise2;
import java.io.File;

public class File02 {
    public static void main(String[] args) {
        File f1=new File("E:\\241170020143");
        System.out.println(f1.isDirectory());
        File f2=new File("E:\\241170020143\\nxk.txt");
        long time=f2.lastModified();
        System.out.println(time);
    }
}
