package exercise2;

import java.io.*;
import java.nio.channels.NetworkChannel;

public class FileIostream {
    public static void main(String[] args) throws IOException {
        File outputfile=new File("E:\\241170020143\\nxk.txt");
        File dir=new File("dir");
        byte[] b = {72, 101, 108, 108, 111, 32, 87, 111, 114, 108, 100};
        try{
//            //Reader inputStream=new Reader(outputfile);
//            FileOutputStream outputStream=new FileOutputStream(outputfile);
//            int i=inputStream.read();
//            while( i!=-1){
//                System.out.print((char)i);
//                i=inputStream.read();
//            }


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
