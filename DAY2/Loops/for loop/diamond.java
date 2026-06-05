import java.util.Scanner;

public class diamond {
     public static void main(String[] args){
        System.out.println("Enter the number of rows for the star pattern");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //diamond star pattern
        System.out.println("Here is the diamond star pattern:");
        for (int row = 1; row <= num; row++) {
            for (int space = 1; space <= num - row; space++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= 2*row-1; col++) {
                System.out.print("* ");
            }
            System.out.println();
                    
        }
        for (int row = num - 1; row >= 1; row--) {
            for (int space = 1; space <= num - row; space++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= 2*row-1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
