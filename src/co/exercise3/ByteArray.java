package co.exercise3;
import java.io.*;
import java.util.Scanner;

public class ByteArray {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Folder path : ");
        String path=sc.nextLine();
        File folder=new File(path);
        File[] files=folder.listFiles();
        for(int i=0;i<files.length;i++){
            String s=new String();
            s=files[i].getName();
            System.out.println(s);
        }
        System.out.println("Enter extension of file you want to read : ");
        String ext=sc.next().toLowerCase();
        for(int i=0;i<files.length;i++){
            if(files[i].getName().toLowerCase().endsWith(ext)){
                FileInputStream in=new FileInputStream(files[i].getPath());
                byte[] bt= new byte[(int)files[i].length()];
                int count=0;
                while((count=in.read(bt))>0){
                    System.out.println(new String(bt));
                }
                in.close();

            }
        }
    }
}
