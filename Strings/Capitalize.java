package Strings;
import java.util.*;
public class Capitalize {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] arr=str.split(" ");
        for(int i=0;i<arr.length;i++){
            char a=Character.toUpperCase(arr[i].charAt(0));
            char b=Character.toUpperCase(arr[i].charAt(arr[i].length()-1));
            System.out.println(a+arr[i].substring(1,arr[i].length()-1)+b);
        }
    }
}
