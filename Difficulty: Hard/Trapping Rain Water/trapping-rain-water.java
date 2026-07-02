class Solution {
    public int maxWater(int arr[]) {
        // code here
        int left=0;
        int right=arr.length - 1;
        
        int water = 0;
        int left_max = arr[left];
        int right_max = arr[right];
        
        while(left < right){
            if(left_max < right_max){
                left++;
                left_max = Math.max(left_max,arr[left]);
                water += left_max - arr[left];
            }
    
            else{
                right--;
                right_max = Math.max(right_max, arr[right]);
                water += right_max - arr[right];
            }
        }
        return water;
    }
}
