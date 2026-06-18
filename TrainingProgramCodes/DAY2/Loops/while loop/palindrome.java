import java.util.Scanner;
public class palindrome {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a palindrome");
        int n = num.nextInt();
        int original = n;
        int reverse = 0;
        while(n!=0){
            int lastdigit = n%10;
            reverse = (reverse*10) + lastdigit;
            n = n/10;
        }
        System.out.println("The reverse of the number is " + reverse);
        if(original == reverse){
            System.out.println("The number is a palindrome");
        }
        else{
            System.out.println("The number is not a palindrome");
        }
    }
}
