class Solution {
    public int[] getConcatenation(int[] nums) {
        int l = nums.length*2;
        int ans[] = new int[l];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i+ nums.length] = nums[i];
        }
        
        return ans;
    }
}