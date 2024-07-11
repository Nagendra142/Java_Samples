package Strings;

public class FindSubStr {
    public static void main(String args[]){
        String a="bn";
        String str="sdfghjkaebn";
        System.out.println(str.indexOf(a));
        for(int i=0;i<str.length()-a.length()-2;i++){
            if(str.substring(i,i+a.length()).equals(a)){
                System.out.println(i);
                return;
            }
            
        }
        // System.out.println(str.substring(1,a.length()+1));
    }
}
