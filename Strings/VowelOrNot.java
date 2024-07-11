package Strings;
import java.util.ArrayList;
import java.util.Arrays;
public class VowelOrNot {
    public static void main(String args[]){
        char chr='k';
        ArrayList<Character> arr=new ArrayList<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        if(arr.contains(chr))
        System.out.println("Yes");
        System.out.println("no");
    }
}
