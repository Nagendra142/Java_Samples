package Recursion;

public class Reduce_steps {
    public static void main(String[] args) {
        int n=8;
        int c=helper(n);
        System.out.println(c);
    }
    static int helper(int n){
        if(n<=0){
            return 0;
        }
        if(n%2==0)
        return 1+helper(n/2);
        else
        return 1+helper(n-1);
    }
}
