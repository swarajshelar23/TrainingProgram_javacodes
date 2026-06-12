package DAY11.Interfaces.Restraunt;

public class Dominos implements RestrauntServices {

    @Override
    public void acceptOrder(String customerName, String order) {
        System.out.println("Dominos accepted order from " + customerName + ": " + order);
    }

    @Override
    public void prepareFood(String order) {
        System.out.println("Dominos is preparing: " + order);
        System.out.println("Your meal is ready: " + order);
    }

    @Override
    public void deliverFood(String customerName, String order) {
        System.out.println("Your order is out for delivery: " + order);
        System.out.println("Dominos delivered " + order + " to " + customerName);
    }
    
}
