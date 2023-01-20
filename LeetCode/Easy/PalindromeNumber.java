package LeetCode.Easy;

class Solution {
    public boolean isPalindrome(int x) {
        boolean isneg = false;

        if (x < 0) {
            isneg = true;
            x *= -1;
        }

        int n, sum = 0, reminder;
        n = x;

        while (n != 0) {
            reminder = n % 10;
            sum = sum * 10 + reminder;
            n /= 10;
        }

        if (isneg) {
            x *= -1;
        }

        return sum == x;
    }
}
