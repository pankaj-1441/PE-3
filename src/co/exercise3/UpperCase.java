package co.exercise3;

import java.io.*;
import java.util.Scanner;

public class UpperCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the complete path of the file: ");
        String path=sc.nextLine();
        File file=new File(path);

        try {
            FileReader reader = new FileReader(file);
            BufferedReader bf=new BufferedReader(reader);
            String line;
            while((line=bf.readLine())!=null){
                System.out.println(line.toUpperCase());

            }
            System.out.println("The length of the file is : "+file.length());

            bf.close();
            reader.close();
        }
        catch (FileNotFoundException e){
            System.out.println("Enter valid File path");
        } catch (IOException e) {
            System.out.println("IO Exception");
        }

    }
}
