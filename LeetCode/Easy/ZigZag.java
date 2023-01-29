import java.util.Arrays;

class Solution {
    static int getCols(int rows, int n){
        int sections = (int) Math.ceil(n / (2 * rows - 2.0));

        return sections * (rows - 1);
    }
    
    public String convert(String s, int numRows) {
        if (numRows == 1)
            return s;

        int n = s.length();
        int numCols = getCols(numRows,n);
        char[][] m = new char[numRows][numCols];
        
        for (int i=0; i<numRows; i++){
            for (char[] c : m){
                Arrays.fill(c, ' ');
            }
        }

        int currentCharIndex = 0;
        int currentRow = 0;
        int currentCol = 0;

        while (currentCharIndex < n){

            while (currentRow < numRows && currentCharIndex < n){
                m[currentRow][currentCol] = s.charAt(currentCharIndex);
                currentRow++;
                currentCharIndex++;
            }

            print(m, numRows, numCols);

            currentRow = numRows - 2;
            currentCol++;

            while (currentRow > 0 && currentCol < numCols && currentCharIndex < n){
                m[currentRow][currentCol] = s.charAt(currentCharIndex);
                currentRow--;
                currentCol++;
                currentCharIndex++;
            }

            print(m, numRows, numCols);

            currentRow = 0;
        }

        return print(m, numRows, numCols);
    }

    static String print(char[][] arr, int a, int b){
        String s = "";

        for (int i=0; i<a; i++){
            for (int j=0; j<b; j++){
                if (arr[i][j] != ' '){
                    System.out.printf("%c\t", arr[i][j]);
                    s += arr[i][j] + "";
                }
            }
            System.out.println();
        }

        System.out.println();

        return s;
    }
}

public class ZigZag{
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println();s.convert("zcdffagygmalkzfmqavtzeqfjtmdxvvwxbefdmfjyfukhcwxctqdziliexlbtjzsmfxprfzqmvctxbqcuifurqcvqqyjzxbnfbcwidouzrowsgyopgiiyndoddxeabrhevgmzuiynywhfxywdggbvlsaopgqszyyvekuavuqtqxanxysgewbpocdfkwakuyfalbagvqblqcbnavvhrxyhbeplapvwncwydwgypimhmnwmksvcpulsyadapbwfdsdjqmhfutmgilutdqxumimmlrmauifyalhqxqytmmzuxtpalouzxilkaxkufsuhfdacwyvikwekrukfihehpqtrpeoxyiedoehkeesrcybtunyfudmmvgfkmthmcorsuaczewsiutbpgcudhircqwoeqyqumjogjqhpozxiubzddvikezowxebpctlqdzzmrgcfibqecrhhnrtrshnsoqhqkvhnwizoqdvahnflhotugmnawcsktccdxlstttjkxhkgwrrdgkzozmoxphjkllpizhduapgzwrfukzaslzgkoxjfgsprgezflezntgnrzumltoefnkpdhbiptzgzdhgqmighqtzpnnchbgmqrduaeesaeybjiiawqgdgbcxorzxuillbrhdxlvxpwzbejdazlfhmkgcbhcwpnjqequcdrbvncwrlztmkzvyjbaklciaqrtwhpangeiugensdhgpgcnrfnbqsktkdogndjalniftmvnrcuikyvbdkeueqnoubxhgghrvrzofueyyagiydlbpp", 6);
    }
}