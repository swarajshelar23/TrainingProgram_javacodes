package DAY4.Practice;
import java.util.Scanner;
public class Zomato {
    static double orderfood(Scanner sc){
        System.out.print("Enter the type of food: ");
        String FoodType = sc.nextLine();
        double finalPrice = 0;
            switch(FoodType.toLowerCase()) {
                case "misal":
                    System.out.print("Enter the quantity of misal: ");
                    int misalQty = sc.nextInt();
                    finalPrice += misalQty * 50;
                    break;
                case "pavbhaji":
                    System.out.print("Enter the quantity of pavbhaji: ");
                    int pavbhajiQty = sc.nextInt();
                    finalPrice += pavbhajiQty * 80;
                    break;
                case "vada pav":
                    System.out.print("Enter the quantity of vada pav: ");
                    int vadapavQty = sc.nextInt();
                    finalPrice += vadapavQty * 30;
                    break;
                case "bhel puri":
                    System.out.print("Enter the quantity of bhel puri: ");
                    int bhelpuriQty = sc.nextInt();
                    finalPrice += bhelpuriQty * 40;
                    break;
                default:
                    System.out.println("Invalid food type.");
            }
        return finalPrice;
    }

    static double deliveryCharges(double finalPrice, double distance) {
        if(distance < 2){
            return 0;
        }
        else if(distance >= 2 && distance < 5){
            return (distance * 2);
        }
        else if(distance >= 5 && distance < 10){
            return (distance * 3);
        }
        else{
            return (distance * 5);
        }
    }

    static double applyCoupon(double finalPrice, Scanner sc) {
        System.out.print("Do you have a coupon? (Y/N): ");
        String response = sc.nextLine();
        
        if(response.equalsIgnoreCase("Y")) {
            System.out.print("Enter coupon code: ");
            String enteredCoupon = sc.nextLine();
            if (enteredCoupon.equals("IPLRCB")) {
                double discount = finalPrice * 0.25;
                System.out.println("Coupon applied! Discount: " + discount);
                return discount;
            } else {
                System.out.println("Invalid coupon code.");
            }
        }
        return 0;
    }

    static double GST(double finalPrice) {
        return (finalPrice * 0.18);
    }

    static void totalAmount(double foodPrice, double deliveryCharges, double couponDiscount, double gst) {
        System.out.println("\n====== BILL SUMMARY ======");
        System.out.println("Food Price: " + foodPrice);
        System.out.println("Delivery Charges: " + deliveryCharges);
        System.out.println("Coupon Discount: -" + couponDiscount);
        double subtotal = foodPrice + deliveryCharges - couponDiscount;
        System.out.println("Subtotal: " + subtotal);
        System.out.println("GST (18%): " + gst);
        double finalBill = subtotal + gst;
        System.out.println("FINAL BILL: " + finalBill);
        System.out.println("=========================\n");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Get food order
        double PriceofFood = orderfood(sc);
        
        // Get distance
        System.out.print("Enter the distance for delivery (km): ");
        double distance = sc.nextDouble();
        sc.nextLine(); // Consume newline
        
        // Calculate delivery charges
        double deliveryCharge = deliveryCharges(PriceofFood, distance);
        
        // Apply coupon
        double couponDiscount = applyCoupon(PriceofFood, sc);
        
        // Calculate GST
        double subtotalBeforeGST = PriceofFood + deliveryCharge - couponDiscount;
        double gstAmount = GST(subtotalBeforeGST);
        
        // Display bill
        totalAmount(PriceofFood, deliveryCharge, couponDiscount, gstAmount);
        
        sc.close();
    }
}