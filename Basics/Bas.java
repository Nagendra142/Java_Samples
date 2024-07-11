package Basics;
import java.util.*;

public class Bas {
    public static void main(String... arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=sc.nextLine();
        String s="";
        System.out.println(Character.ign('t'));
        for(int i=0;i<str.length();i++){
            char A=str.charAt(i);
            if(Character.isAlphabetic(A)){
                s+=A;
            }
        }
        System.out.println(s);
        // for(int i=0;i<str.length();i++){
        //     char A=str.charAt(i);
        //     if(A=='a' || A=='e' || A=='i'|| A=='o'||A=='u' ||A==' '){
        //       continue;
        //     }
        //     else{
        //         s+=A;
        //     }
        // }
        // System.out.println(s);
    }
}
