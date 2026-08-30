class Solution {
    public int[] productExceptSelf(int[] nums) {

        // product of the values in an array
        int prefix = 1;
        int suffix = 1;
        int n = nums.length;

        int[] results = new int[n];


        //product of prefix of array
        for(int i = 0; i < results.length; i++){
            results[i] = prefix ;
            prefix = prefix * nums[i];
        }

         for (int i = n - 1; i >= 0; i--) {
            results[i] =  results[i] * suffix;
            suffix = suffix * nums[i];
        }


        return results;
        
    }
}  
