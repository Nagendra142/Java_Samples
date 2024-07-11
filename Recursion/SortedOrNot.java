package Recursion;

public class SortedOrNot {
    public static void main(String[] args) {
        int[] arr={1,2,4,7,5,6};
        boolean ch=helper(arr,0);
        System.out.println("It is Sort Or Not:"+ch);
    }
    static boolean helper(int[] ar,int i){
        if(i==ar.length-1){
            return true;
        }
        return (ar[i]<=ar[i+1] && helper(ar,i+1));
    }
}
