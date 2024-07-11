package Strivers.Arrays;

public class Union {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,4,7,9};
        int[] a={3,3,5,6,7,10};
        int i=0,j=0,k=0;
        // int max=Math.max(arr.length,a.length);
        int new_arr[]=new int[arr.length+a.length];
        while(arr.length>i && a.length>j){
            if(arr[i]==a[j]){
                i++;
            }
            else if(arr[i]<a[j]){
                new_arr[k]=arr[i];
                k++;
                i++;
            }
            else{
                new_arr[k]=a[j];
                k++;
                j++;
            }
        }
        while(i<arr.length){
            new_arr[k]=arr[i];
            k++;
            i++;
        } 
        while(j<a.length){
            new_arr[k]=a[j];
            k++;
            j++;
        }
        for(int l=0;l<new_arr.length;l++){
            System.out.print(new_arr[l]+" ");
        }
    }
}
