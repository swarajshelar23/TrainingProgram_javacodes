package DAY4.RECURSION;
import java.util.Scanner;
public class Exponential1 {
    static int Exponential12(int n, int a){
        if(a==0){
            return 1;
        }
        else
            {
                return n*Exponential12(n, a-1);

        }
        }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("base number bol:");
        int num = sc.nextInt();
        System.out.println("exponent number bol:");
        int num2 = sc.nextInt();
        System.out.println(Exponential12(num, num2));
        sc.close();

    }
}