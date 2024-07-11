package Basics;
import java.util.*;

public class alphabets {
    boolean magic(int val){
       int temp=val;
       int sum=0;
       while(temp>0){
        sum+=temp%10;
        temp/=10;
       }
       temp=sum;
       int rev=0;
       while(temp>0){
        rev=rev*10+temp%10;
        temp/=10;
       }
       System.out.println(sum+" "+rev+" "+val);
       return sum*rev==val;
    }
    
}
class Hello{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        // int num=sc.nextInt();
        int num=sc.nextInt(),sum=1;
        
        // System.out.println();
        // for(int i=0;i<num;i++){
        //     boolean val=new alphabets().isArmstrong(i);
        //     if(val)
        //     System.out.println(i);
        // }
         System.out.println(new alphabets().magic(num));
    }
}
