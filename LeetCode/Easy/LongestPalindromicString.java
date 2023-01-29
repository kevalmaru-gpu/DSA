import java.util.Arrays;

class Solution {
    static int lps(char seq[], int i, int j, int dp[][])
    {
        if (i == j) {
            return dp[i][j] = 1;
        }
 
        if (seq[i] == seq[j] && i + 1 == j) {
            return dp[i][j] = 2;
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }

        if (seq[i] == seq[j]) {
            return dp[i][j] = lps(seq, i + 1, j - 1, dp) + 2;
        }
 
        return dp[i][j] = Math.max(lps(seq, i, j - 1, dp), lps(seq, i + 1, j, dp));
    }
    public int longestPalindrome(String s) {
        int n = s.length();

        int dp[][] = new int[n][n];
        for(int[] arr: dp)
          Arrays.fill(arr, -1);

        return lps(s.toCharArray(), 0, n-1, dp);
    }
}

public class LongestPalindromicString{
    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.longestPalindrome("aba"));
    }
}