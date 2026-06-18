package DAY5.Array;
import java.util.Scanner;
public class LargestandSmallest  {
    public static void main(String[] args){
        int arr[] = new int[8];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<arr.length; i++){
            System.out.print("Enter number " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }
        int largest = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        int smallest = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number:" + smallest);
        sc.close();
    }
}
