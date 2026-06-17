

import java.util.Scanner;

public class pattern {
    public static void main(String[] args){
        System.out.println("Enter the number of rows for the star pattern");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        //star pattern
        System.out.println("Here is the star pattern:");
        for(int row = 1; row <= num ; row++){
            for(int col = 0 ; col < row; col++){
                System.out.print("*");
            }
            System.out.println();
        }

        //reverse star pattern
        System.out.println("Here is the reverse star pattern:");
        for(int row = 1; row <= num ; row++){
            for(int col = num ; col >= row; col--){
                System.out.print("*");
            }
            System.out.println();
        }
        
       
        //holo square star pattern
        System.out.println("Here is the holo square star pattern:");
        for(int row = 0; row<=num; row++){
            for(int col = 0; col <= num; col++){
                if(row == 0 || row == num || col == 0 || col == num){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }      
    }
}
