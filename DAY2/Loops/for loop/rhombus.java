

import java.util.Scanner;

public class rhombus {
    public static void main(String[] args){
        System.out.println("Enter the number of rows for the star pattern");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
    //rhombus star pattern
        System.out.println("Here is the rhombus star pattern:");
        for(int row = 1; row <=num; row++){
            for(int space = 1; space <= num-row ; space++){
                System.out.print(" ");
            }
            for(int col = 1; col <= num; col++){
                System.out.print("*");
            }
            System.out.println();
        }
        //rhombus star pattern2
        System.out.println("Here is the rhombus star pattern2:");
        for(int row = 1; row <=num; row++){
            for(int space = num; space >= num-row ; space--){
                System.out.print(" ");
            }
            for(int col = 1; col <= num; col++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
