class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                ans[i] = i + nums[i];
            }
            else {
                ans[i] = ans[i-1] + nums[i];
            }
        }
        return ans;
    }
}