package DAY5.Array;
import java.util.Scanner;
public class SumMarks {
    public static void main(String[] args){
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<arr.length; i++){
            System.out.print("Enter marks " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
        }
        System.out.println("Sum of marks: " + sum);
        sc.close();
    }
    
}
