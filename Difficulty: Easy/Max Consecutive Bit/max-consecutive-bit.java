class Solution {
    public int maxConsecBits(int[] nums) {
        int max0 = 0, max1 = 0;
        int curr0 = 0, curr1 = 0;

        for (int num : nums) {
            if (num == 0) {
                curr0++;
                curr1 = 0;
            } else {
                curr1++;
                curr0 = 0;
            }

            max0 = Math.max(max0, curr0);
            max1 = Math.max(max1, curr1);
        }

        return Math.max(max0, max1);
    }
}