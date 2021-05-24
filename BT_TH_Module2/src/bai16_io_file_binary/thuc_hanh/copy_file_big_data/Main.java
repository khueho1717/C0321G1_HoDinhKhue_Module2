package bai16_io_file_binary.thuc_hanh.copy_file_big_data;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Main {
    private static void copyFileUsingJava7Files(File source,File dest)throws IOException {
        Files.copy(source.toPath(),dest.toPath(), StandardCopyOption.REPLACE_EXISTING);

    }
    private static void copyFileUsingStream(File source,File dest)throws IOException{
        InputStream is=null;
        OutputStream os=null;
        try {
            is=new FileInputStream(source);
            os= new FileOutputStream(dest);
            byte[] buffer=new byte[1024];
            int legth;
            while ((legth=is.read(buffer))>0){
                os.write(buffer,0,legth);
            }
        }finally {
            is.close();
            os.close();
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter source file:");
        String sourcePath=scanner.nextLine();
        System.out.println("Enter destination file");
        String destPath=scanner.nextLine();
        File sourceFile=new File(sourcePath);
        File destFile=new File(destPath);
        try {
            copyFileUsingJava7Files(sourceFile,destFile);
//            copyFileUsingStream(sourceFile,destFile);
            System.out.println("Copy complete");
        } catch (IOException e) {
            System.out.println("Can't copy that file");
            System.out.println(e.getMessage());
        }
//        file source: bt_th_module2/src/bai16_io_file_binary/thuc_hanh/copy_file_big_data/source.txt
//        file dest: bt_th_module2/src/bai16_io_file_binary/thuc_hanh/copy_file_big_data/dest.txt
    }
}
