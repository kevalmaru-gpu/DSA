class Solution {
    public int titleToNumber(String columnTitle) {
        int res = 0;

        if (columnTitle.length() == 1)
            return (int)columnTitle.charAt(0) - 64; 

        for (int i=0; i<columnTitle.length(); i++){
            res *= 26;
            res += (int)columnTitle.charAt(i) - 64;
        }

        return res;
    }
}