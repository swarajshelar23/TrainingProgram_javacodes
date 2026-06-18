package DAY5.Array;
import java.util.Scanner;
public class InputArr {
    public static void main(String[] args){
    int arr[] = new int[5];
    Scanner sc = new Scanner(System.in);
    for(int i = 0; i<arr.length; i++){
        System.out.print("Enter element " + (i+1) + ": ");
        arr[i] = sc.nextInt();
    }
    for(int i = 0; i<arr.length; i++){
        System.out.print(arr[i] + ", "+"");
    }
    sc.close();
}
}
