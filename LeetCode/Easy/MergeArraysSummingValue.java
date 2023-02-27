import java.util.ArrayList;

class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int n=nums1.length, m=nums2.length;
        ArrayList<int[]> set = new ArrayList<>();
        
        int i=0, j=0, k=0;

        while (i < n && j < m){
            int[] s = new int[2];
            if (nums1[i][0] < nums2[j][0]){
                s[0] = nums1[i][0];
                s[1] = nums1[i][1];
                set.add(s);
                i++; k++;
            }
            else if(nums1[i][0] > nums2[j][0]){
                s[0] = nums2[j][0];
                s[1] = nums2[j][1];
                set.add(s);
                j++; k++;
            }
            else{
                s[0] = nums1[i][0];
                s[1] = nums1[i][1] + nums2[j][1];
                set.add(s);
                i++; j++;
            }
        }

        while (i < n){
            int[] s = new int[2];
            s[0] = nums1[i][0];
            s[1] = nums1[i][1];
            set.add(s);
            i++; k++;
        }
        while (j < m){
            int[] s = new int[2];
            s[0] = nums2[j][0];
            s[1] = nums2[j][1];
            set.add(s);
            j++; k++;
        }
        
        int sol[][] = new int[set.size()][2];
        for (int a=0; a<set.size(); a++){
            sol[a] = set.get(a);
        }

        return sol;
    }
}

public class MergeArraysSummingValue {
    public static void main(String[] args) {
    }
}
