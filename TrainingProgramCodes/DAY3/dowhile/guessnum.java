package DAY3.dowhile;
import java.util.Scanner;
public class guessnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int guess;
        int p1 = (int)(Math.random() * 1000) + 1;
        int count = 0;
        do{
            count++;
            System.out.println("Guess the number");
            guess = sc.nextInt();
            if (guess > p1){
                System.out.println("Too high");
            }
            else if (guess < p1){
                System.out.println("Too low");
            }
            else{
                System.out.println("Congratulations! You guessed the number in " + count + " attempts.");
            }

        }while(guess != p1);
    }
}
