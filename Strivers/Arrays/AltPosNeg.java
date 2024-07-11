package Strivers.Arrays;
import java.util.*;
public class AltPosNeg {
    public static void main(String[] args) {
        int[] arr={1,2,3,-2,-4,-2};
        int pos=0,neg=1;
        int a[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                a[pos]=arr[i];
                pos=pos+2;
            }
            else{
                a[neg]=arr[i];
                neg=neg+2;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
