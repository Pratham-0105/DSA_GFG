class Solution {
    public static int minCost(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int cost = 0;
        int idx = 0;
        int a;
        for( int ele : arr){
            pq.add(ele);
        }
        while(pq.size()>1){
            a = pq.remove()+pq.remove();
            cost = cost+a;
            pq.add(a);
        }
        return cost;
        
    }
}