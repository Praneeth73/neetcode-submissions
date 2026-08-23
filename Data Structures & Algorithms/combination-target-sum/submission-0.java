class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        //  brute force is to find all the subsets with is O(n square)
        // 2,5,6,9
        // 2,2,5
        // 9
        List<Integer> subset = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        recurse(0, nums, target, subset, result);
        return result;
    }

    public static void recurse(
        int ind, int[] nums, int target, List<Integer> subset, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(subset));
            return;
        }
        if (target < 0 || ind == nums.length) {
            return;
        }
        if (nums[ind] <= target) {
            subset.add(nums[ind]);
            recurse(ind, nums, target - nums[ind], subset, result);
            subset.remove(subset.size()-1);
        }
        recurse(ind + 1, nums, target, subset, result);
    }
}
