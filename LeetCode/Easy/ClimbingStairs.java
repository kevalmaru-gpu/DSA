class Solution {
    public int climbStairs(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;

        int a = 1, b = 2, c ;

        for (int i=2; i<n; i++){
            c = a + b;
            b = a;
            a = c;
        }

        return c;
    }
}