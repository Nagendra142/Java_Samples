package Recursion;

public class RotatedBinary {
    public static void main(String[] args) {
        int[] arr={6,8,10,12,15,1,3,4,5};
        int tar=1;
        int index=helper(arr,tar,0,arr.length);
        System.out.println(index);
    }
    static int helper(int[] arr,int tar,int st,int en){
        if(st>en){
            return -1;
        }
        int mid=(st+en)/2;
        if(arr[mid]==tar){
            return mid;
        }
        else if(arr[mid]>tar){
            if(arr[mid+1]<=tar){
                return helper(arr,tar,mid+1,en);
            }
            else{
                return helper(arr,tar,mid-1,en);
            }
        }
        else{
            if(arr[0]>tar){
                return helper(arr,tar,st,mid);
            }
            else{
                return helper(arr,tar,st,mid-1);
            }
        }
            
    }
}
