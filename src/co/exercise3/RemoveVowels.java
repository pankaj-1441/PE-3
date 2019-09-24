package co.exercise3;

import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of cities you want to enter : ");
        int n=sc.nextInt();
        String[] s=new String[n];
        System.out.println("Enter cities names : ");
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
      String[] sa=new String[n];
        for(int i=0;i<n;i++){
            sa[i]=s[i].replaceAll("[AEIOUaeiou]","");
        }

        for(int i=0;i<n;i++){
            System.out.println(sa[i]);
        }
    }
}
