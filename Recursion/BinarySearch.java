package Recursion;
import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={3,4,7,8,9,10,10,10,10,10,34,56,78};
        int tar=10;
        helper(arr,tar,0,arr.length-1);
        Collections.sort(list);
        System.out.println("Target value index is "+list);
    }
    static ArrayList<Integer> list=new ArrayList<>();
    static void helper(int[] ar,int tar,int st,int en){
        if(st>en){
            return;
        }
        int mid=(st+en)/2;
        if(ar[mid]==tar){
            int temp=mid;
            while(ar[mid]==tar){
                list.add(mid);
                mid++;
            }
            --temp;
            while(ar[temp]==mid){
                list.add(temp);
                temp--;
            }
        }
        else if(ar[mid]>tar){
            helper(ar,tar,st,mid-1);
        }
        else{
            helper(ar,tar,mid+1,en);
        }
    }
}
