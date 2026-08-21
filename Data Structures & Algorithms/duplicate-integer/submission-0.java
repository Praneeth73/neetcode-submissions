class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> duplicates = new HashSet<Integer>();

        for(int i = 0; i < nums.length ;i++){
            if(!duplicates.add(nums[i])){
                return true;
            }
        }

        return false;
    }
}