package TCS_interview.basics;
import java.util.*;
public class reverse {
    public static void main(String... args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string value:");
        String n=sc.next();
        int len=n.length()-1;
        int start=0;
        char[] arr=n.toCharArray();
        while(start<len){
            char a=arr[start];
            arr[start]=arr[len];
            arr[len]=a;
            start++;
            len--;
        }
        System.out.println(new String(arr));
    }
}
