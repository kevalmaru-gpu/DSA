class Solution {
    public double myPow(double x, int n) {
        if (n == 0) return 1;
        if (n == Integer.MIN_VALUE){
            x *= x;
            n /= 2;
        }
        if (n < 0){
            n = -n;
            x = 1/x;
        }

        return (n % 2 == 0) ? myPow(x * x, n / 2) : x * myPow(x * x, n / 2);
    }
}

public class Pow{
    public static void main(String[] args) {
        Solution s = new Solution();

        s.myPow(2.0, -2);
    }
}