package Basics;
import java.util.*;
public class LargestEle {
    public static void main(String... arg){
        
        int[] arr={10, 324, 45, 90, 9808};
        int max=Integer.MIN_VALUE;
        int sec=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
           if(arr[i]>max){
            sec=max;
            max=arr[i];
           }
           else if(arr[i]>sec && arr[i]<max){
            sec=arr[i];
           }
        }
        System.out.println("Max element is:"+max+" Second max ele: "+sec);
        
    }
}
