package Strivers.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr={0,0,0,4,0,0,1,2,0};
        int non_zero=0;
        int zero=0;
        int i=0;
        while(non_zero<arr.length){
            if(arr[i]!=0 && non_zero==zero){
                non_zero++;
                zero++;
                i++;
            }
            else if(arr[i]!=0 && zero<non_zero){
                arr[zero]+=arr[non_zero];
                arr[non_zero]=arr[zero]-arr[non_zero];
                arr[zero]=arr[zero]-arr[non_zero];
                i=zero;
                non_zero=zero;
            }
            else{
                non_zero++;
                i++;
            }
        }
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }
}
