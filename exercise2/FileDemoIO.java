package exercise2;
import java.io.*;
public class FileDemoIO {
    public static void main(String[] args )throws IOException {
        File file=new File("file.txt");
        File dir=new File("dir");
        File newdir=new File("E:\\24112");
        File newfile=new File("E:\\JavaDemo143\\nxk.txt");
        File rename=new File("E:\\241170020143");

        //newdir.mkdir();
        //newfile.createNewFile();
        newdir.renameTo(rename);
        newfile.delete();
    }
}
