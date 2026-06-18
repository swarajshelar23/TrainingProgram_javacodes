package DAY10.Polymorphism.FoodOrdering;



public class Food {
    
    void Order(){
        System.out.println("No item selected");
    }

    void Order(String item){
        System.out.println("You have ordered: " + item);
    }

    void Order(String item, int quantity){
        if(item.isEmpty() || quantity <= 0){
            System.out.println("Invalid order. Please select a valid item and quantity.");
            return;
        }
        int price = 20;
        int total = price * quantity;
        System.out.println("You have ordered: " + quantity + " " + item + " for a total of $" + total);

    }

    void Order(String item, int quantity, double discount){
        if(item == null || item.isEmpty() || quantity <= 0 || discount < 0 || discount > 1){
            System.out.println("Invalid order. Please select a valid item, quantity, and discount.");
            return;
        }
        int price = 20;
        double total = quantity * price;
        double discountedTotal = total - (total * discount);
        System.out.println("You have ordered: " + quantity + " " + item + " for a total of $" + discountedTotal + " after a discount of " + (discount * 100) + "%");    
    }

    void Order(String item[], int quantity[]){
        if(item == null || quantity == null || item.length != quantity.length){
            System.out.println("Invalid order. Please select valid items and quantities.");
            return;
        }

        int grandTotal = 0;
        int price = 200;
        for(int i = 0; i < item.length; i++){
            int bill = quantity[i] * price;
            grandTotal += bill;
            System.out.println("You have ordered: " + quantity[i] + " " + item[i]);
        }
        System.out.println("Total amount: $" + grandTotal);
    }





}
