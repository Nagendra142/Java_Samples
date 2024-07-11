package Strivers.Arrays;

public class SecondLargestWithoutSort {
    public static void main(String[] args) {
        int[] arr={3,7,9,198,13,190};
        int max=Integer.MIN_VALUE;
        int sec_max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                sec_max=max;
                max=arr[i];
            }
            else if(arr[i]>sec_max && arr[i]<max){
                sec_max=arr[i];
            }
        }
        System.out.println(sec_max);

    }
}
