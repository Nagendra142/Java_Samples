package Strivers.Arrays;
import java.util.*;
public class ZeroOneTwoSort {
    public static void main(String[] args) {
        int[] arr={0,1,1,0,1,2,1,2,0,0,0,1};
        int low=0;
        int mid=0;
        int high=arr.length-1;
        while(mid<=high){
            if(arr[low]==0 && mid==low){
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else if(arr[mid]==0){
                arr=swap(arr,mid,low);
                mid++;
                low++;
            }
            
            else if(arr[mid]==2){
                arr=swap(arr,mid,high);
                high--;
            }
            
        }
        System.out.println(Arrays.toString(arr));
        
    }
    static int[] swap(int[] arr,int val,int v){
            arr[val]=arr[val]+arr[v];
            arr[v]=arr[val]-arr[v];
            arr[val]=arr[val]-arr[v];
            return arr;
    }
}
