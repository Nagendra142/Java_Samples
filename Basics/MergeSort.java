package Basics;
import java.util.*;
public class MergeSort {
    public static void main(String... args){
        int[] arr={3,8,2,90,67,12,5};
        // System.out.println(Arrays.toString(arr));
        Merge(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void Merge(int[] arr,int low,int high){
        if(low<high){
            int mid=(low+high)/2;
            Merge(arr,low,mid);
            Merge(arr,mid+1,high);
            arr=Sort(arr,low,mid,high);
        }
    }
    static int[] Sort(int[] arr,int l,int m,int h){
        int[] a=new int[m-l+1];
        int[] b=new int[h-m];
        for(int i=0;i<a.length;i++){
            a[i]=arr[l+i];
        }
        for(int j=0;j<b.length;j++){
            b[j]=arr[m+j+1];
        }
        int i=0,j=0;
        int ar=l;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                arr[ar]=a[i];
                i++;
                ar++;
            }
            else{
                arr[ar]=b[j];
                j++;
                ar++;
            }
        }
        while(i<a.length){
            arr[ar]=a[i];
            i++;
            ar++;
        }
        while(j<b.length){
            arr[ar]=b[j];
            j++;
            ar++;
        }
        return arr;
    }
}
