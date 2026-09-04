class Solution {
    public int maxProduct(int[] nums) {
        int minprod =1;
        int maxprod = 1;
        int res = nums[0] ;

        for(int num : nums){
           int  temp = maxprod * num;
            maxprod  = Math.max(Math.max(num * maxprod, num * minprod),num);
            minprod = Math.min(Math.min(temp, num * minprod),num);
            res = Math.max(res,maxprod);
        }

        return res;
    }
}
