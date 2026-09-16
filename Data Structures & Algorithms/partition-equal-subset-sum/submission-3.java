class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        if (sum % 2 != 0) {
            return false;
        }

        int target = sum / 2;
        boolean[][] dp = new boolean[nums.length][target + 1];

        return findTarget(nums, target, dp);
    }

    public boolean findTarget(int[] nums, int target, boolean[][] dp) {
        // Column 0: all rows can make sum=0
        for (int i = 0; i < nums.length; i++) {
            dp[i][0] = true;
        }

        // First row: can we make sum=nums[0]?
        if (nums[0] <= target)
            dp[0][nums[0]] = true;

        int n = nums.length;

        // Fill the rest of the DP table
        for (int ind = 1; ind < n; ind++) {
            for (int t = 1; t <= target; t++) {
                boolean notTake = dp[ind - 1][t];
                boolean take = false;
                if (nums[ind] <= t) {
                    take = dp[ind - 1][t - nums[ind]];
                }

                dp[ind][t] = notTake || take;
            }

           
        }
         return dp[nums.length - 1][target];
    }
}
