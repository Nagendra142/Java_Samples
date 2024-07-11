package Strings;
import java.util.*;
public class RotateKele {
    public static void main(String... args){
        int[] arr={2,3,4,5,6,7,8};
        int k=2;
        arr=Rev(arr,0,arr.length-1);
        arr=Rev(arr,0,arr.length-k-1);
        System.out.println(Arrays.toString(arr));

    }
    static int[] Rev(int[] arr,int s,int end){
        while(s<end){
            int a=arr[s];
            arr[s]=arr[end];
            arr[end]=a;
            s++;
            end--;
        }
        return arr;
    }
}
