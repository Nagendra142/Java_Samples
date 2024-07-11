package Strings;
import java.util.*;
public class ReverseOfStrings {
    public static void main(String args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] arr=str.split(" ");
        for(int i=arr.length-1;i>=0;i--){
            StringBuilder s=new StringBuilder(arr[i]);
            System.out.println(s);
        }
    }
}
