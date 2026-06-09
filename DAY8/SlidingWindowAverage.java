package DAY8;

public class SlidingWindowAverage {
    public static void main(String[] args){
       int arr[] = {1, 2, 1, 3, 5, 3, 6, 7};
       int k = 4;
        double sum = 0;
        for(int i = 0; i<k; i++){
            sum += arr[i];
        }
         double Avg = sum/k;

        for(int i = k; i<arr.length; i++){
            sum = sum - arr[i-k] + arr[i];
            double currentAvg = sum/k;
            if(currentAvg > Avg){
                Avg = currentAvg;
            }
        }
        System.out.println("Average of subarray of size " + k + " is: " + Avg);
    }
}
