package Strings;
import java.util.*;
public class countchar {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two strings::");
        String str=sc.next();
        int sum=0;
        while(!str.isEmpty() && str!=null){
            char ch=str.charAt(0);
            if(Character.isUpperCase(ch)){
                System.out.println(ch);
                return;
            }
            str=str.substring(1);
        }
        
    }
}
