class Solution {
    static int distinct(int arr[], int n) {
        // code here
        HashSet<Integer> h = new HashSet<>();
        
        for(int ele : arr) h.add(ele);
        return h.size();
    }
}