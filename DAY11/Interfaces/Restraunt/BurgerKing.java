package DAY11.Interfaces.Restraunt;

public class BurgerKing implements RestrauntServices {

    String item;

    BurgerKing(String item) {
        this.item = item;

    }

    @Override
    public void acceptOrder(String customerName, String order) {
        System.out.println("Burger King accepted order from " + customerName + ": " + order);
    }

    @Override
    public void prepareFood(String order) {
        System.out.println("Preparing your meal: " + order);
        System.out.println("Your meal is ready and you get a free chocolava cake: " + order);
    }

    @Override
    public void deliverFood(String customerName, String order) {
        System.out.println("Your order is out for delivery: " + order);
        System.out.println("Burger King delivered " + order + " to " + customerName);
    }



}
