package Strings;
import java.util.*;
public class Reverse {
    public static void main(String... arg){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char[] arr=str.toCharArray();
        int start=0;
        int end=arr.length-1;
        while(start<end){
            char a=arr[start];
            arr[start]=arr[end];
            arr[end]=a;
            start++;
            end--;

        }
        str=String.valueOf(arr);
        System.out.println(str);
    }
}
