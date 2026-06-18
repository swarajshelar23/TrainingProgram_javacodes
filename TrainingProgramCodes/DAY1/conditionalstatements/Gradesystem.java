package conditionalstatements;
import java.util.Scanner;
public class Gradesystem {
    public static void main(String[] args){
        String grade;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the percentage: ");
        double percentage = sc.nextDouble();

        if(percentage >= 90){
            grade = "A";
        } else if(percentage < 90 &&percentage >= 80){
            grade = "B";
        } else if(percentage < 80 && percentage >= 70){
            grade = "C";
        } else if(percentage < 70 && percentage >= 60){
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("Grade: " + grade);
    }
}
