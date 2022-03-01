public class TimeComplexity{
    public static void main(String[] args){
        double prevTime = System.currentTimeMillis();

        TimeComplexity timeComplexityInst = new TimeComplexity();
        System.out.println(timeComplexityInst.find_factorial(99999));
        // System.out.println(timeComplexityInst.find_factorial_method2(99999));

        System.out.println("Time Complexity: " + (System.currentTimeMillis() - prevTime) + "ms");
    }

    public int find_factorial(int n){
        return n * (n + 1) / 2;
    }

    public int find_factorial_method2(int n){
        int sum = 0;

        for (int i=1;i<=n;i++){
            sum = sum + i;
        }

        return sum;
    }
}