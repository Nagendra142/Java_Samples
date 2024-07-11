package Strivers.Arrays;
import java.util.*;
public class LeftRotate {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int k=5;
        arr=Reverse(arr,0,arr.length-1);
        // System.out.println(Arrays.toString(arr));
        arr=Reverse(arr,0,k-1);
        // System.out.println(Arrays.toString(arr));
        arr=Reverse(arr,k,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    static int[] Reverse(int[] arr,int st,int end){
        while(st<end){
            int temp=arr[st];
            arr[st]=arr[end];
            arr[end]=temp;
            st++;
            end--;
        }
        return arr;
    }
}
