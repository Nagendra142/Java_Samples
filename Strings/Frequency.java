package Strings;
import java.util.*;
public class Frequency {
    public static void main(String... arg){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int[] arr=new int[26];
        // for(int i=0;i<str.length();i++){
        //     char A=Character.toLowerCase(str.charAt(i));
        //     arr[A-'a']++;
        // }
        // for(int i=0;i<26;i++){
        //     if(arr[i]!=0)
        //     System.out.println(arr[i]+" "+(char)(i+'a'));
        // }

        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<str.length();i++){
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
        }
        for(char i:map.keySet()){
            System.out.println(i+" "+map.get(i));
        }
}
}
