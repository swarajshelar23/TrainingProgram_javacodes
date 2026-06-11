package DAY10.Polymorphism;



public class Food {
    
    void Order(){
        System.out.println("No item selected");
    }

    void Order(String item){
        System.out.println("You have ordered: " + item);
    }

    void Order(String item, int quantity){
        int price = 20;
        int total = price * quantity;
        System.out.println("You have ordered: " + quantity + " " + item + " for a total of $" + total);

    }

    void Order(String item, int quantity, double discount){
        int price = 20;
        double total = quantity * price;
        double discountedTotal = total - (total * discount);
        System.out.println("You have ordered: " + quantity + " " + item + " for a total of $" + discountedTotal + " after a discount of " + (discount * 100) + "%");    
    }

    void Order(String item[], int quantity[]){
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
