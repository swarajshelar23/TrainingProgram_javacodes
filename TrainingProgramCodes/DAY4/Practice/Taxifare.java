package DAY4.Practice;
import java.util.Scanner;
public class Taxifare {
    static int Taxi(String typeoftaxi, double distance, double time){
        if(typeoftaxi.equalsIgnoreCase("bike")){
            return (int)(distance * 10);
        } else if(typeoftaxi.equalsIgnoreCase("car")){
            return (int)(distance * 25);
        } else if(typeoftaxi.equalsIgnoreCase("rental")){
            if(time <= 1){
                return (int)(distance * 25);
            } else if (time <= 2 && time > 1) {
                return (int)(distance * 30);
            } else {
                return (int)(distance * 40);
            }
        } else {
            System.out.println("Invalid taxi type.");
            return -1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the type of taxi (bike, car, rental): ");
        String typeoftaxi = sc.nextLine();
        System.out.print("Enter the distance: ");
        double distance = sc.nextDouble();

        double time = 0;
        if(typeoftaxi.equalsIgnoreCase("rental")){
            System.out.print("Enter rental time (hours): ");
            time = sc.nextDouble();
        }

        int fare = Taxi(typeoftaxi, distance, time);
        if(fare >= 0){
            System.out.println("Fare: " + fare);
        }
        sc.close();
    }
}
