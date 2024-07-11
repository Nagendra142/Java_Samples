package Strings;
import java.util.Arrays;
import java.util.Scanner;
public class countWords {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name::");
        String str1=sc.nextLine();
        // String str=sc.nextLine();
        // int i=0,count=0;
        // while(i<str.length()){
        //     if(str.charAt(i)==' '){
        //         count++;
        //     }
        //     i++;
        // }
        // System.out.println(count+1);
        String[] str=str1.split(" ");
        System.out.println(Arrays.toString(str));
        System.out.println(str.length);
        }
}
