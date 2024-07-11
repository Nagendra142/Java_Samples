package Strivers.Arrays;
import java.util.*;
public class NextPermutation1 {
    public static void main(String[] args) {
        int[] arr={4,3,2,1,0};
        int n=arr.length-1;
        int index=-1;
        for(int i=n-2;i>=0;i--){
            if(arr[i+1]>arr[i]){
                index=i;
                break;
            }
        }
        if(index==-1){
            Reverse(arr,0,arr.length-1);
        }
        else{
            for(int i=n;i>index;i--){
                if(arr[i]>arr[index]){
                    swap(arr,i,index);
                    break;
                }
            }
            Reverse(arr,index+1,arr.length-1);
        }
        System.out.println(Arrays.toString(arr));
        
    }
    static void Reverse(int[] arr,int st,int end){
        while(st<end){
            int temp=arr[st];
            arr[st]=arr[end];
            arr[end]=temp;
            end--;
            st++;
        }
    }
    static void swap(int[] arr,int v,int e){
        int temp=arr[v];
        arr[v]=arr[e];
        arr[e]=temp;
    }
}
