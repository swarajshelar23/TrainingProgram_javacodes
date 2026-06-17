package DAY2.Practice;
import java.util.Scanner;
public class Nestedif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of 10th standard:");
        double tenth = sc.nextDouble();
        System.out.println("Enter the marks of 12th standard:");
        double twelth = sc.nextDouble();
        System.out.println("Enter the CGPA:");
        double cgpa = sc.nextDouble();
        System.out.println("Enter the placement percentage:");
        double placement = sc.nextDouble();
        if(tenth >=60){
            if(twelth >=60){
                if(cgpa >=7.5){
                    if(placement>80){
                        System.out.println("Eligible for placement");
                        
                    }
                    else{
                        System.out.println("Not eligible for placement less placement percentage");
                    }
                }
                else{
                        System.out.println("Not eligible for placement less CGPA");
                    }
            }
            else{
                        System.out.println("Not eligible for placement less marks in 12th");
                    }
        }
        else{
                        System.out.println("Not eligible for placement less marks in 10th");
                    }
    }
}
