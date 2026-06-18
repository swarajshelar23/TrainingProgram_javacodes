package DAY2.Practice;
import java.util.Scanner;
public class Switchcase {
    public static void main(String[] args) {
        System.out.println("1. paratha 2. poha 3. idli 4. dosa");
        Scanner obj = new Scanner(System.in);
        int option = obj.nextInt();
        switch(option){
            case 1:
                System.out.println("paratha");
                break;
            case 2:
                System.out.println("poha");
                break;
            case 3:
                System.out.println("idli");
                break;
            case 4:
                System.out.println("dosa"); 
                break;
            default:
                System.out.println("khana khatam ho gya");
        }
    }
}
