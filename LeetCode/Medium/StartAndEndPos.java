public class StartAndEndPos {
    public static int[] searchRange(int[] nums, int target) {
        int i=0, m, j=nums.length - 1;
        int[] arr = new int[2];
        arr[0] = -1; arr[1] = -1;

        while (i < j){
            m = (i + j) / 2;
            if (target > nums[m]) i = m + 1;
            else j = m; 
        }
        System.err.println(i);

        if (arr[i] != target) return arr;
        arr[0] = i ;

        j = nums.length - 1;
        while (i < j){
            m = (i + j) / 2 + 1;
            if (target < nums[m]) j = m - 1;
            else i = m;
        }
        arr[1] = j;

        System.err.println(j);
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};

        searchRange(arr, 8);
    }
}