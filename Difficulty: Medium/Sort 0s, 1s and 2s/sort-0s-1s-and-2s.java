class Solution {
    public void sort012(int[] arr) {
        // code here
        int n = arr.length-1;
        
        int low=0, mid=0, high = n;
        
        while(mid<=high){
            if(arr[mid] == 0){
                arr[mid] = arr[low];
                arr[low] = 0;
                low++;
                mid++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else {
                arr[mid] = arr[high];
                arr[high] = 2;
                high--;
            }
        }
    }
}