package Basics;

public class BinarySearch {
    public static void main(String args[]){
        int arr[]={2,23,24,25,34,56,78,90,123};
        System.out.println(new BinarySearch().Binary(arr,90,0,arr.length));
    }
    int Binary(int[] arr,int val,int start,int end){
        int mid=(end+start)/2;
        
        if(arr[mid]==val){
            return mid;  
        }
        if(start>=end){
            return -1;
        }
        if(arr[mid]>val){
            end=mid-1;
        }
        else if(arr[mid]<val){
            start=mid+1;
        }
        // System.out.println(arr[mid]);
        return Binary(arr,val,start,end);

    }
}
