class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].charAt(1) == '+' || operations[i].charAt(2) == '+') {
                x++;
            }
        
            else if (operations[i].charAt(1) == '-' || operations[i].charAt(2) == '-') {
                x--;
            }
        }
        
        return x;
    }
}