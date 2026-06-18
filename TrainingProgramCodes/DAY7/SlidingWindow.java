package DAY7;

public class SlidingWindow {
    public static void main(String[] args){
        int arr[] = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 6;

        int max = 0;

        for(int i = 0; i <= arr.length - k; i++){
            max += arr[i];
        }

        int currentMax = max;

        for(int i = k; i<arr.length; i++){
            max = max - arr[i-k] + arr[i];
            if(max > currentMax){
                currentMax = max;
                
            }
        }
        System.out.println("Maximum sum of subarray of size " + k + " is: " + currentMax);

    }
}
