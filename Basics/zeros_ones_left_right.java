package Basics;

public class zeros_ones_left_right {
    public static void main(String args[]){
        int[] arr={1,0,0,1,0,1,0,1,0,0,0,1,1,0,1,0,1,0,0};
        int i=0,j=0;
        while(i<arr.length && j<arr.length){
            if(arr[i]!=1){
                i++;
                j++;
            }
            else if(arr[j]==0){
                arr[i]=0;
                arr[j]=1;
                i++;
                j=i;
            }
            else{
                j++;
            }
        }
        for(int k=0;k<arr.length-1;k++){
            System.out.print(arr[k]+" ");
        }
    }
}
