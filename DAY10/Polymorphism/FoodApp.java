package DAY10.Polymorphism;

public class FoodApp {
    public static void main(String[] args) {
        Food cust1 = new Food();
        cust1.Order("Burger");
        Food cust2 = new Food();
        cust2.Order("Pizza", 2);
        Food cust3 = new Food();
        cust3.Order("Pasta", 3, 0.1);
        Food cust4 = new Food();
        String items[] = {"Sushi", "Ramen", "Tempura"};
        int quantities[] = {2, 1, 3};
        cust4.Order(items, quantities);
        
    }
}