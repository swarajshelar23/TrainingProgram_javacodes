package DAY5.Array;

public class Demo {
    public static void main(String[] args){
        //int arr[] = {1,2,3,4,5};
        int arr1[] = new int[5]; 
        for (int i = 0; i<arr1.length; i++){
            arr1[i] = i+1;
        }
        // Print the elements of the array
        for (int i = 0; i<arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }
        System.out.println(); // Print a new line
        for (int i = 0; i<arr1.length; i++){
            if (arr1[i] % 2 == 0) {
                System.out.println(arr1[i] + " is even");
            } else {
                System.out.println(arr1[i] + " is odd");
            }
        }
    }
}
