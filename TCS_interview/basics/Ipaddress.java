package TCS_interview.basics;
import java.util.*;
public class Ipaddress {
    public static void main(String... args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string:");
        String str=sc.nextLine();
        System.out.println(str);
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='.'){
                count++;
            }
        }
        if(count!=3){
            System.out.println("Invalid");
            return;
        }
        String[] arr=str.split("\\.");
        for(int i=0;i<arr.length;i++){
            try{
                int a=Integer.parseInt(arr[i]);
                if(a>999 || a<0){
                    System.out.println("Invalid");
                    return;
                }
            }
            catch(Exception e){
                System.out.println("Invalid");
                return;
            }
        }
       System.out.println("Valid");
    }
}
