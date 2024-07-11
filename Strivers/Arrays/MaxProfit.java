package Strivers.Arrays;

public class MaxProfit {
    public static void main(String[] args) {
        int[] arr={7,6,4,3,1};
        int max=0;
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]-min>max){
                max=arr[i]-min;
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(max);
    }
}
