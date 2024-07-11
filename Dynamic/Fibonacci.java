public class Fibonacci {

    public static void main(String[] args) {
        int n = 7;
        int[] dp = new int[n + 1];
        // tabulation
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        System.out.println("Fibonacci(" + n + ") = " + dp[n]);
    }
    // memorization
    // static int fibonacci(int n, int[] dp) {
    //     if (n <= 1) {
    //         return n;
    //     }
    //     if (dp[n] != 0) {
    //         return dp[n];
    //     }
    //     dp[n] = fibonacci(n - 1, dp) + fibonacci(n - 2, dp);
    //     return dp[n];
    // }
}
