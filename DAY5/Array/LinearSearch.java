package DAY5.Array;

public class LinearSearch {
    static void findElement(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index: " + i);
                return;
            }
        }
        System.out.println("Element not found in the array.");
    }
      public static void main(String[] args) {
        int arr[] = {1, 4, 2, 6, 7, 2, 7};
        int key = 6;
        LinearSearch.findElement(arr, key);
    }
}
