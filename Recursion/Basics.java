package Recursion;

public class Basics {
    public static void main(String[] args) {
        PrintVal(5);
    }
    static void PrintVal(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        PrintVal(n-1);
        System.out.println(10+n);
    }
}
