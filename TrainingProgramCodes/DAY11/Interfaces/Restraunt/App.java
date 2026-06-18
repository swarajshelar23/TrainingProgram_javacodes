package DAY11.Interfaces.Restraunt;

public class App {
    public static void main(String[] args){
        // RestrauntServices services = new RestrauntServices();
        // System.out.println("Restraunt type: " + services.Restraunttype);

        RestrauntServices order = new BurgerKing("Chicken Whooper");
        order.acceptOrder("John", "Chicken Whooper");
        order.prepareFood("Chicken Whooper");
        order.deliverFood("John", "Chicken Whooper");

        RestrauntServices order2 = new Dominos();
        order2.acceptOrder("Alice", "Pepperoni Pizza");
        order2.prepareFood("Pepperoni Pizza");
        order2.deliverFood("Alice", "Pepperoni Pizza");
        
    }
}
