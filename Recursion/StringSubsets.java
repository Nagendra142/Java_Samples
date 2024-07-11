package Recursion;

public class StringSubsets {
    public static void main(String[] args) {
        String str="abc";
        helper(str," ");
    }
    static void helper(String str,String res){
        if(str.isEmpty()){
            System.out.println(res);
            return;
        }
        char ch=str.charAt(0);
        helper(str.substring(1),res+ch);
        helper(str.substring(1),res);
    }
}
