package TCS_interview.basics;

public class fibonacci {
    public static void main(String... args){
        System.out.println(Fib(40));// the value not process if the value more than 40 because over stack o(n^2))
        long a=0,b=1;
        for(int i=2;i<=100;i++){//o(n) it works
            long c=a+b;
            a=b;
            b=c;
        }
        System.out.println(b);
    }

    static long Fib(long n){
        if(n<2){
            return n;
        }
        return Fib(n-1)+Fib(n-2);
    }
    
}
