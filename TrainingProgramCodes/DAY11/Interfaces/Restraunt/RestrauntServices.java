package DAY11.Interfaces.Restraunt;

public interface RestrauntServices {
    String Restraunttype = "Gourmet";


    void acceptOrder(String customerName, String order);

    void prepareFood(String order);

    void deliverFood(String customerName, String order);
}
