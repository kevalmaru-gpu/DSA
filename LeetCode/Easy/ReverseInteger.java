class Solution {
    public int reverse(int x) {
        long sum, rem, sol = 0;
        sum = x;

        if (x > Integer.MAX_VALUE || x < -Integer.MAX_VALUE)
            return 0;

        while (sum/10 != 0){
            rem = sum % 10;
            sum = sum / 10;
            sol = sol * 10 + rem;
        }

        rem = sum % 10;
        sol = sol * 10 + rem;

        if (sol > Integer.MAX_VALUE || sol < -Integer.MAX_VALUE)
            return 0;
        else
            return (int)sol;
    }
}

public class ReverseInteger{
    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.reverse(-23));

    }
}