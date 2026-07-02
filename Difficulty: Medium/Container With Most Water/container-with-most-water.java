class Solution {
    public int maxWater(int arr[]) {
        // Code Here
        int maxarea = 0;
        int n = arr.length;
        
        int i=0, j = n-1;
        
        while(i<=j){
            int h = Math.min(arr[i],arr[j]);
            int b = j-i;
            int area = h*b;
            maxarea = Math.max(maxarea,area);
            
            if(arr[i]<=arr[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return maxarea;
    }
}