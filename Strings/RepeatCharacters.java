package Strings;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
public class RepeatCharacters {
    public static void main(String args[]){
        // String st="478";
        // int a=Integer.parseInt(st);
        // String str=String.valueOf(a);
        // char[] chr=st.toCharArray();
        // System.out.println(Arrays.toString(chr));
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        // int[] arr=new int[26];
        // for(int i=0;i<str.length();i++){
        //     char s=str.charAt(i);
        //     if(Character.isLowerCase(str.charAt(i))){
        //        s=Character.toUpperCase(str.charAt(i));
        //     }
        //     arr[s-'A']+=1;
        // }
        // for(int i=0;i<26;i++){
        //     System.out.printf("%c %d",(char)(i+'A'),arr[i]);
        // }
        Map<Character,Integer> map=new TreeMap<>();
        for(int i=0;i<str.length();i++){
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
        }
        for(char i:map.keySet()){
            System.out.printf("%c %d -",i,map.get(i));
        }
    }
}
