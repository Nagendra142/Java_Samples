package Recursion;

public class Permutation {
    public static void main(String[] args) {
        String str="abc";
        helper(str,0,str.length()-1);
    }
    static void helper(String str,int s,int en){
        if(s==en){
            System.out.println(str);
            return;
        }
        else{
            for(int i=s;i<=en;i++){
                System.out.println("i:"+i+" s:"+s+" str:"+str);
                str=swap(str,i,s);
                helper(str,s+1,en);
                str=swap(str,i,s);
            }
        }
    }
    static String swap(String st,int i,int j){
        char[] chr=st.toCharArray();
        char a=chr[i];
        chr[i]=chr[j];
        chr[j]=a;
        return String.valueOf(chr);
    }
}
