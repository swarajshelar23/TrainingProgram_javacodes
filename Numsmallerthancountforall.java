class Numsmallerthancountforall{
    public static void main(String[] args) {
        int[] nums = {8, 1, 2, 9, 3};
        Numsmallerthancountforall solution = new Numsmallerthancountforall();
        int[] result = solution.smallerNumbersThanCurrent(nums);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int count = 0;

            for (int j = 0; j < n; j++) {
                if (i != j && nums[j] < nums[i]) {
                    count++;
                }
            }

            ans[i] = count;
        }

        return ans;
    }
}