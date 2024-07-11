package Strings;
import java.util.*;
public class SumNumber {
    public static void main(String... arg){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int sum=0;
        for(int i=0;i<str.length();i++){
            char A=str.charAt(i);
            if(Character.isDigit(A)){
                sum+=(A-'0');
            }
        }
        System.out.println(sum);
    }
}
