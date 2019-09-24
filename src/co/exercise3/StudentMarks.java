package co.exercise3;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students : ");
        int n = sc.nextInt();
        int[] stuGrades = new int[n];
        try {
            for (int i = 0; i < n; i++) {
                System.out.println("Enter marks of student " + (i + 1) + " : ");
                stuGrades[i] = sc.nextInt();
                if (stuGrades[i] < 0 || stuGrades[i] > 100) {
                    throw new Exception("Enter marks in the range 0-100 only");
                }
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

}
