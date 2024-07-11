package Strivers.Arrays;
import java.util.*;
public class AltPosNegNotEq {
    public static void main(String[] args) {
        int[] arr={1,-4,-1,8,-9,-3,8};
        ArrayList<Integer> positive=new ArrayList<>();
        ArrayList<Integer> negative=new ArrayList<>();
        int pos=0,neg=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                positive.add(arr[i]);
                pos++;
            }
            else{
                negative.add(arr[i]);
                neg++;
            }
        }
        // System.out.println(negative.subList(2,negative.size()));
        int[] a=new int[arr.length];
        int k=0;
        if(pos>neg){
            for(int i=0;i<neg;i++){
                a[k++]=positive.get(i);
                a[k++]=negative.get(i);
            }
            for(int i=neg;i<pos;i++){
                a[k++]=positive.get(i);
            }
        }
        else{
            for(int i=0;i<pos;i++){
                a[k++]=positive.get(i);
                a[k++]=negative.get(i);
            }
            for(int i=pos;i<neg;i++){
                a[k++]=negative.get(i);
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
