class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> subset = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        
        subSetsRecursion(0,nums,subset,result);
        return result;
    }

    public static void subSetsRecursion(int ind,int[] nums, List<Integer>  subset,
    List<List<Integer>> result){
        if(ind == nums.length){
             result.add(new ArrayList<>(subset));
            return;
        }
        
        subset.add(nums[ind]);
        subSetsRecursion(ind+1,nums,subset,result);
        subset.remove(subset.size()-1);

        int next = ind + 1;
    while (next < nums.length && nums[next] == nums[ind]) {
        next++;
    }
        subSetsRecursion(next,nums,subset,result);


    }
}
