import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class FloydWarshalAlgo {
    public static void main(String[] args) {
        HashMap<Integer, ArrayList[][]> set = new HashMap<>();
        int n = 4;

        int[][][] arrs = new ArrayList[n][n][n];

        for (int i=0; i<n; i++){
            set.put(i, arrs[i]);
        }
    }
}
