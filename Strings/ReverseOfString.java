package Strings;
import java.util.*;
public class ReverseOfString {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] arr=str.split(" ");
        for(int i=arr.length-1;i>=0;i--){
            StringBuilder s=new StringBuilder(arr[i]);
            s.reverse();
            System.out.println(s);
        }
    }
}
