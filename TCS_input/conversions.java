package TCS_input;
// import java.util.*;
public class conversions{
    public static void main(String args[]){
        // System.out.println("Hello");
        int a=45;
        String binary=Integer.toBinaryString(a);
        String octal=Integer.toOctalString(a);
        String hex=Integer.toHexString(a);
        System.out.println(binary+" "+octal+" "+hex);
        int decimal=Integer.parseInt(binary,2);
        System.out.println(decimal);
    }
}