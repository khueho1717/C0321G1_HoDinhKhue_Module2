package bai16_io_file_binary.bai_tap.optional_copy_file_binary;

import java.awt.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileBinary {
    public static void main(String[] args) {
        String fileSource="fileSource.txt";
        String fileDest="fileDest.txt";
        try {
            FileInputStream fis=new FileInputStream(fileSource);
            FileOutputStream fos=new FileOutputStream(fileDest);
            byte[] bytes=new byte[1024];
            int noOfBytes=0;
            System.out.println("tien hanh copy file");
            while ((noOfBytes=fis.read(bytes))!=-1){
                fos.write(bytes,0,noOfBytes);
            }
            System.out.println("copy thanh cong");
            fis.close();
            fos.close();
        } catch (FileNotFoundException fos) {
            System.out.println("khong tim duoc file: "+fos);
        } catch (IOException fis) {
            System.out.println("loi khi copy file: "+fis);
        }
    }
}
