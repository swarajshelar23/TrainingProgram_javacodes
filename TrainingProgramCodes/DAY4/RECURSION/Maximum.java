package DAY4.RECURSION;

import java.util.Scanner;

public class Maximum {
    static int Max(int n){
        if(n==0){
            return 0;
        }
        else{
            int lastdigit = n%10;
            int largest = Max(n/10);
            if(lastdigit>largest){
                return lastdigit;
            }
            else{
                return largest;
            }
        }
    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Series: ");
        int num = obj.nextInt();
        int Maxnum = Max(num);
        System.out.println("Largest number in serires: "+Maxnum);
    }
}
