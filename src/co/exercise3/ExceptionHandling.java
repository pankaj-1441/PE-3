package co.exercise3;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        try{
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter length of the array : ");
            int a=sc.nextInt();
            String[] n=new String[a];
            for(int i=0;i<a;i++){
                n[i]=null;
            }
            System.out.println("Enter index you want to access : ");
            int b=sc.nextInt();
            System.out.println(n[b]);
            System.out.println("Enter the index of element you want to convert to lower case : ");
            int c=sc.nextInt();
            System.out.println(n[c].toLowerCase());







        }
        catch(NegativeArraySizeException a){
            System.out.println("Error: The size of array cannot be negative");

        }
        catch(IndexOutOfBoundsException b){
            System.out.println("Error: The index of array was beyond the max. possible index");
        }
        catch (NullPointerException c){
            System.out.println("Error: null value occured");
        }

    }
}
