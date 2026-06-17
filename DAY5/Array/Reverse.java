package DAY5.Array;

import java.util.Scanner;
public class Reverse { 

    public static void main(String[] args){
        int arr[] =  new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<arr.length; i++){
            System.out.print("Enter number " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
         }
         for(int item : arr){
            System.out.println(item);
         }
         

        
    }

}