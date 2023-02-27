class Solution {
    public int minMaxDifference(int num) {
        int[] max = new int[10];
        int[] min = new int[10];

        String s = String.valueOf(num);
        int maxDiff = 0;

        for (int i=0; i<10; i++){
            max[i] = -1;
            min[i] = -1;
        }

        for (int i=0; i<s.length(); i++){
            int index = Integer.parseInt(s.charAt(i) + "");

            if (max[index] == -1){
                max[index] = Integer.parseInt(s.replace( s.charAt(i), '9'));
            }

            if (min[index] == -1){
                min[index] = Integer.parseInt(s.replace(s.charAt(i), '0'));
            }

            int diff = max[index] - min[index];
            maxDiff = diff > maxDiff ? diff : maxDiff;
        }

        for (int i=0; i<10; i++){
            if (max[i] == -1)
                continue;
            // System.out.printf("%d, ",i);
            for (int j=0; j<10; j++){
                if (min[j] == -1)
                    continue;
                // System.out.printf("%d\n",j);
                int diff = max[i] - min[j];
                maxDiff = diff > maxDiff ? diff : maxDiff;
            }
        }
        
        return maxDiff;
    }
}

public class p1{
    public static void main(String[] args) {
        Solution s = new Solution();
        s.minMaxDifference(90);
    }
}