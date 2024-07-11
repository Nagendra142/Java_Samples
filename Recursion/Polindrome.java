package Recursion;

public class Polindrome {
    public static void main(String[] args) {
        int n=12344321;
        boolean ch=Check(n);
        System.out.println(ch);
    }
    // static boolean Check(int n){
    //     while((int)Math.log10(n)>0){
    //         int s=(int)Math.log10(n);
            
    //         int left=n/((int)Math.pow(10,s));
    //         n=n%((int)Math.pow(10,s));
    //         int right=n%10;
    //         n=n/10;
    //         // System.out.println(s+" "+left+" "+n+" "+right+" "+n);
    //         // System.out.println(1567/1000);
    //         if(left!=right){
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    static boolean Check(int n){
        if((int)Math.log10(n)<1){
            return true;
        }
        int start=(int)Math.log10(n);
        int s=n/(int)Math.pow(10,start);
        n=n%(int)Math.pow(10,start);
        int e=n%10;
        n=n/10;
        if(s!=e){
            return false;
        }
        return Check(n);
    }
    
}
