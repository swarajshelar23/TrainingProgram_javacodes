package DAY5.Array;

public class DuplicateArray {
      public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,4,4,4,1};
        int j = 0;

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }

        for (int i = 0; i <= j; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
