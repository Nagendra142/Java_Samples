package Strings;
import java.util.Scanner;

public class countCharacters {
    public static void main(String args[]){
        System.out.println("Enter the character::");
        Scanner sc=new Scanner(System.in);
        char a=sc.next().charAt(0);
        if(Character.isLowerCase(a)){
            a=(char)(a-32);
        }
        if('A'==a || 'E'==a || 'I'==a || 'O'==a || 'U'==a){
            System.out.println("It is vowel");
            return;
        }
        System.out.println("Not vowel");
    }
}
