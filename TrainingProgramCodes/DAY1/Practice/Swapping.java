package Practice;
public class Swapping {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 0;
        System.out.println("Before swapping: " + a + " " + b);
        c = a;
        a = b;
        b = c;
        System.out.println("After swapping: " + a + " " + b);

        // Swapping without using a temporary variable
        int p = 33;
        int q = 23;
        System.out.println("Before swapping: " + p + " " + q);
        p = p + q; 
        q = p - q; 
        p = p - q;
        System.out.println("After swapping: " + p + " " + q);



    }
}
