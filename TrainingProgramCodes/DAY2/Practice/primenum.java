package DAY2.Practice;
import java.util.Scanner;
public class primenum {
    public static void main(String[] args){
        System.out.println("Enter the number to check if it is prime or not");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;

        for(int i = 2; i<Math.sqrt(num); i++){
            if(num%i == 0){
                count++;
                break;
            }
            }
        if(count == 0){
            System.out.println("The number is prime");
        }else{
            System.out.println("The number is not prime");
        }  
        }
        
    }