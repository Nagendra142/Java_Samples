package Strivers.Arrays;
import java.util.*;
public class Leader {
    public static void main(String[] args) {
        int[] arr={10, 22, 12, 3, 0, 6};
        ArrayList<Integer> list=new ArrayList<>();
        int max=arr[arr.length-1];
        list.add(max);
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>max){
                list.add(0,arr[i]);
                max=arr[i];
            }
        }
        System.out.println(list);
    }
}
