package Basics;
import java.util.Arrays;
public class InsertionSort {
    public static void main(String... args){
        int[] arr={7,8,3,4,90,23,12};
        for(int i=1;i<arr.length;i++){
            int val=arr[i];
            int j=i-1;
            while(j>=0 && val<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=val;
        }
        System.out.println(Arrays.toString(arr));
    }
}
