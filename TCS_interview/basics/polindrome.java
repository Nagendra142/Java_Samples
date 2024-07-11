package TCS_interview.basics;
import java.util.*;

public class polindrome {
    public static void main(String... args){
        Scanner sc=new Scanner(System.in);
        // for integer polindrome
        int num=sc.nextInt();
        int dup=num;
        int reverse=0;
        while(dup>0){
            int rem=dup%10;
            reverse=10*reverse+rem;
            dup/=10;
        }
        System.out.println(reverse==num);



        // for string polindrome
        // System.out.println("Enter String:");
        // String str=sc.next();
        // int start=0;
        // int len=str.length()-1;
        // while(start<len){
        //     if(str.charAt(start)!=str.charAt(len)){
        //         System.out.println("Not polindrome");
        //         return;
        //     }
        //     start++;
        //     len--;
        // }
        // System.out.println("Polindrome");
    }
}
