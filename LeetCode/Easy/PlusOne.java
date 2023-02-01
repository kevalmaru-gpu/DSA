class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        for (int i=n-1; i>=0; i--){
            if (digits[i] < 9){
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] arr = new int[digits.length + 1];
        arr[0] = 1;

        return arr;
    }
}

public class PlusOne{
    static void print(int[] arr){
        for (int i=0; i<arr.length; i++)
            System.out.println(arr[i]);
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] num = {1,2,9};

        print(s.plusOne(num));
    }
}