package DAY5.Array;

public class Sort {
    public static void main(String[] args) {

        int arr[] = {1, 4, 2, 6, 7, 2, 7};
        boolean sorted = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                sorted = false;
                break;
            }
        }

        if (sorted) {
            System.out.println("It is sorted");
        } else {
            System.out.println("It is not sorted");
        }
    }
}
    
