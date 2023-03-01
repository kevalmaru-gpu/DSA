public class HappyNumber {
    
}
import java.util.HashSet;

class Solution {
    int getSum(int n){
        int res = 0;

        while (n != 0){
            res += Math.pow(n % 10, 2);
            n = n / 10;
        }

        return res;
    }

    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();

        while (true){
            n = getSum(n);

            if (n == 1)
                return true;
            
            if (!set.add(n))
                return false;
        }
    }
}