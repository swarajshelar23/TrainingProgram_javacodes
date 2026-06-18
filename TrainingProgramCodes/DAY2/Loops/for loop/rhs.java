import java.util.Scanner;

public class rhs {
    public static void main(String[] args){
        System.out.println("Enter the number of rows for the star pattern");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //right angled triangle star pattern
        System.out.println("Here is the right angled triangle star pattern:");
        for(int row = 1; row <= num ; row++){
            for(int space = 1; space <= num-row ; space++){
            System.out.print(" ");
        }
            for(int col = 1 ; col <= row; col++){
            System.out.print("*");
        }
        System.out.println();
        }
        
        //reverse right angled triangle star pattern
        System.out.println("Here is the reverse right angled triangle star pattern:");
        for(int row = 1; row <= num ; row++){
            for(int space = num-row+1 ; space < num ; space++){
            System.out.print(" ");
        }
            for(int col = num ; col >= row; col--){
            System.out.print("*");
        }
        System.out.println();
        }
        
    }
}
