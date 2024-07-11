package TCS_interview.basics;

public class SwapString {
    public static void main(String... args){
        String a="Srinu";
        String b="Name";
        int len_a=a.length();
        int len_b=b.length();
        // without 3rd variable swap strings
        a=a+b;
        b=a.substring(0,len_a);
        a=a.substring(len_a,len_b+len_a);
        System.out.println(a+" "+b);
    }
}
