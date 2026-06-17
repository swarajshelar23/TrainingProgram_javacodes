package DAY6;

public class MoveZeroToBack {
    static void moveZeroToBack(int arr[]){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                arr[count++] = arr[i];
            }
        }
        while(count < arr.length){
            arr[count++] = 0;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,0,0,3,0, 0, 4};
        System.out.println("Original array: ");
        for (int item : arr) {
            System.out.print(" " + item + " ");
        }
        System.out.println();
        System.out.println("Array after moving zeros to the back: ");
        moveZeroToBack(arr);
        for (int item : arr) {
            System.out.print(" " + item + " ");
        }
        System.out.println();
    }
}
