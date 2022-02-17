class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        int temp = 0;
        
        for (int i = 0; i < n; i++) {
            ans[i] = temp + nums[i];
            temp += nums[i];
        }
        return ans;
    }
}