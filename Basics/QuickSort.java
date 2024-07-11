package Basics;
import java.util.*;
public class QuickSort {

    static int Partition(int[] arr,int low,int high){
        int pivot=arr[low];
        int j=high,i=low;
        while(i<j){
            while(i<arr.length && arr[i]<=pivot){
                i=i+1;
            }
            while(arr[j]>pivot){
                j--;
            }
            // System.out.println("arr:"+arr[j]+" "+arr[i]);
            if(i<j)
            arr=swap(arr,i,j);
            System.out.println(Arrays.toString(arr));
        }
        arr=swap(arr,j,low);
        return j;
    }
    static int[]  swap(int[] arr,int min,int max){
        int temp=arr[min];
        arr[min]=arr[max];
        arr[max]=temp;
        return arr;
    }
    static void Quick(int[] arr,int low,int high){
        if(low<high){
            int pa=Partition(arr,low,high);
            Quick(arr,low,pa);
            Quick(arr,pa+1,high);
        }
    }
    public static void main(String... args){
        int[] arr={7,3,4,9,10,2,1};
        Quick(arr,0,arr.length-1);
        System.out.println("Sorted"+Arrays.toString(arr));
    }
}
