package Strings;
import java.util.Scanner;
import java.util.Arrays;
public class Polindrome {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        // char ch=sc.next().charAt(0);
    //     System.out.println((int)ch);
    //     if(65<=ch && ch<=92){
    //         System.out.println("Uppercase");
    //         ch+=32;
    //     }
    //     else if(97<=ch && ch<=123){
    //         System.out.println("lowercase");
    //         ch-=32;
    //     }
    //     System.out.println(ch);
    int i=0,la=str.length()-1;
    char[] chr=str.toCharArray();
    while(i<la){
        char temp=chr[i];
        chr[i]=chr[la];
        chr[la]=temp;
        i++;
        la--;
    }
    
    String a=new String(chr);
    System.out.println(a);
    }
}
