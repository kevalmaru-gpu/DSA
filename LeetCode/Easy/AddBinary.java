class Solution {
    int binaryToDecimal(String binary){
        int sum = 0;
        int n = binary.length() - 1;
        
        for(int i=0; i<binary.length(); i++){
            sum += Character.getNumericValue(binary.charAt(i)) * Math.pow(2, n - i);
        }

        return sum;
    }

    String decimalToBinary(int decimal){
        int sum = decimal;
        String binary = "", thelp = "";

        // if (sum <= 0)
        //     return "0";

        while (true){
            if (sum < 0)
                break;

            thelp = ((double)sum/2 - sum/2) > 0 ? "1" : "0" ;
            binary = thelp + binary;
            sum = sum / 2;     
        }

        return binary;
    }

    public String addBinary(String a, String b) {
        return decimalToBinary((binaryToDecimal(a) + binaryToDecimal(b)));
    }
}

public class AddBinary{
    public static void main(String[] args) {
        Solution s = new Solution();
        String a = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
        String b = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";
        long c = s.binaryToDecimal(a) + s.binaryToDecimal(b);

        System.out.printf("%d",c);

        // System.out.println(s.decimalToBinary(c));
    }
}