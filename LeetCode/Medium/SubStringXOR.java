class Solution {
    String decToBinary(int a){
        return Integer.toBinaryString(a);
    }

    void getIndexs(int[] indexs, String s, String key){
        int k = 0;
        boolean found = false;

        indexs[0] = -1; indexs[1] = -1;

        for (int i=0; i<s.length(); i++){
            if (s.charAt(i) != key.charAt(k))
                continue;

            for (int j=i; j<i + key.length(); j++) {
                if (key.length() > 1 && i + 1 == s.length())
                    break;
                
                if (s.charAt(j) != key.charAt(k)){
                    found = false;
                    break;
                }
                k++;

                if (k == key.length() - 1){
                    found = true;
                }
            }

            if (found == true){
                indexs[0] = i;
                indexs[1] = i + k - 1;
                break;
            }
            k = 0;
        }
    }

    public int[][] substringXorQueries(String s, int[][] queries) {
        int[] indexs = new int[2];

        for (int i=0; i<queries.length; i++){
            int xor = queries[i][0] ^ queries[i][1];
            String binary = decToBinary(xor);
            getIndexs(indexs, s, binary);
            queries[i][0] = indexs[0];
            queries[i][1] = indexs[1];
        }

        return queries;
    }
}

public class SubStringXOR{
    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] arr = {
            {12,8}
        };

        s.substringXorQueries("0101", arr);
    }
}