class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        //1,4,3,2

        int right = 0;
        for(int i = 0 ; i< piles.length;i++){
            right = Math.max(right,piles[i]);
        } 
        
        int left = 1;
        while(left<right){
            int mid = (left+right)/2;
            int ans = 0;
            
             ans = calculateHours(piles, mid);
            

            if(ans <= h ){
                right = mid ;
            }else{
                left = mid + 1;
            }
        }
        return left;

    }

    public static int calculateHours(int[] piles, int hour){
        int sumHours = 0;
        for(int i=0;i<piles.length;i++){
            
            sumHours = sumHours + (int) Math.ceil((double) piles[i] / hour);
            
        }

        return sumHours;
    }
}
