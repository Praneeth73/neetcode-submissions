class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> ls = new ArrayList<>();
        recursion(0, result,ls, nums);

        return result;
    }

    public static void recursion(int ind, List<List<Integer>> result, List<Integer> ls,int[] nums){
        if(ind == nums.length){
            result.add(new ArrayList<>(ls));
            return;
        }

        // Take condition
        ls.add(nums[ind]);
        recursion(ind + 1, result,ls, nums);

        ls.remove(ls.size()-1);

        recursion(ind + 1, result,ls, nums);


    }
}
