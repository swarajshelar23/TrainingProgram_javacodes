package DAY3.function;

import java.util.Scanner;

public class gradesystem {
    static int totalMarks(int m1, int m2, int m3){
        int sum = m1 + m2 + m3;
        return sum;
    }
    static double percentage(int sum){
        double per = (sum * 100.0) / 300.0;
        return per;
    }

    static String grade(double per){
        if(per >= 90.0){
            return "A";
        } else if(per >= 80.0){
            return "B";
        } else if(per >= 70.0){
            return "C";
        } else if(per >= 60.0){
            return "D";
        } else {
            return "F";
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter mark" + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
        int sum = totalMarks(marks[0], marks[1], marks[2]);
        double per = percentage(sum);

        String finalGrade = grade(per);

        System.out.println("Total Marks: " + sum);
        System.out.printf("Percentage: %.2f%%\n", per);
        System.out.println("Grade: " + finalGrade);
        sc.close();
    }
}
