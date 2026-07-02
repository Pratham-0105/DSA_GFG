class Solution {
    public int maxSubarraySum(int[] nums, int k) {
        // Code here
        int windowsum = 0;
        int n = nums.length;

        
        for(int i=0; i<k; i++){

                windowsum += nums[i];

        }
        int maxarr = windowsum;
        for(int j=k; j<n; j++){
            windowsum += nums[j];
            windowsum -= nums[j-k];

            maxarr = Math.max(maxarr,windowsum);
            }
        return maxarr;
        
    }
}