class Solution {
    public String longestPalindrome(String s) {
        String res = "";
        int resN = 0;

        for (int i=0; i<s.length(); i++){
            int a = i, b = i;

            while (a >= 0 && b < s.length() && s.charAt(a) == s.charAt(b)){
                if (b - a + 1 > resN){
                    res = s.substring(a, b + 1);
                    resN = b - a + 1;
                }
                a--;
                b++;
            }

            a = i; b = i + 1;
            while (a >= 0 && b < s.length() && s.charAt(a) == s.charAt(b)){
                if (b - a + 1 > resN){
                    res = s.substring(a, b + 1);
                    resN = b - a + 1;
                }
                a--;
                b++;
            }
        }

        return res;
    }
}

public class LPS{
    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.longestPalindrome("babad"));
    }
}