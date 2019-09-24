package co.exercise3;

import java.util.Arrays;
import java.util.Scanner;

public class ConsecutiveNUmbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Numbers : ");
        String s=sc.nextLine();
        String[] sa=s.split(",");

        int[] n=new int[sa.length];
        for(int i=0;i<sa.length;i++){
            n[i]=Integer.parseInt(sa[i]);
        }
        Arrays.sort(n);
        int count=0;
        for(int i=0;i<n.length-1;i++){
            if((n[i+1]-n[i])!=1)count++;
        }
        if(count==0){
            System.out.println(s+" are consecutive numbers");
        }
        else System.out.println(s+" are non-consecutive numbers");
    }
}
