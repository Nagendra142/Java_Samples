package Strings;
import java.util.*;
public class SubsetOfArray {
    public static void main(String... args){
        int[] arr={2,3,4,5,6,7,8};
        int[] a={4,5,6,7,8};
        int i=0,j=0;
        int count=0;
        int k=0;
        while(i<arr.length){
            if(count==a.length-1){
                System.out.println("consists");
            }
            if(arr[i]==a[j]){
                
                j++;
                count++;
                if(count==1){
                    k=i;
                }
            }
            else{
                count=0;
                j=0;
                i=k;
            }
            i++;
        }

    }
}
