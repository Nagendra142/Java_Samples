package Strivers.Arrays;
public class TwoSum {
    public static void main(String[] args) {
        int[] arr={2,6,5,8,11};
        int value=14;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==value){
                    System.out.println(arr[i]+","+arr[j]);
                }
            }
        }
    }
}
