package Strings;
import java.util.Scanner;
public class compareStrings {
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.println("ENter the string:");
       String sentence=sc.nextLine();
       int vowels=0,con=0,spe=0,dig=0;
       for(int i=0;i<sentence.length();i++){
        char s=sentence.charAt(i);
        if(s=='A' || s=='E' || s=='I' || s=='O' || s=='U' || s=='a' || s=='e' || s=='i' || s=='o' || s=='u'){
            vowels+=1;
        }
        else if(Character.isAlphabetic(s)){
            con+=1;
        }
        else if(Character.isDigit(s)){
            dig+=1;
        }
        else{
            spe+=1;
        }
       }
       System.out.printf("vowels::%d consonents::%d special::%d Digits::%d",vowels,con,spe,dig);
    }
}
