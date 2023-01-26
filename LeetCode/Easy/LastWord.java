class Solution {
    public int lengthOfLastWord(String s) {
        int i = s.length() - 1;
        int st = -99, fi = -99;
        boolean tHelp = false;

        while (true) {
            if (fi == -99 && s.charAt(i) != ' ') {
                fi = i;
            }

            if (fi != -99) {
                tHelp = (i - 1) > 0 ? s.charAt(i - 1) == ' ' : (i - 1) == 0 ? s.charAt(i - 1) == ' ' : true;
                if (tHelp == true) {
                    st = i;
                    break;
                }
            }
            i--;
        }

        System.out.printf("%d, %d\n", st, fi);

        return fi - st + 1;
    }
}

public class LastWord {
    static void print(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        String s = "day";
        Solution sol = new Solution();

        System.out.println(sol.lengthOfLastWord(s));
    }
}
