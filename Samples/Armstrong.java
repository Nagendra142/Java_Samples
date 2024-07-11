import java.util.Scanner;
import java.lang.Math;
class Armstong{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        System.out.println(new CheckArm().IsArmstrong(num));

    }
}
class CheckArm{
    boolean IsArmstrong(int val){
        // int length=(int)Math.log10(val)+1;
        int length=Integer.toString(val).length();
        int a=Integer.parseInt(Integer.toString(val));
        int temp=val;
        int sum=0;
        while(temp>0){
            sum+=Math.pow((temp%10),length);
            temp=temp/10;

        }
        return val==sum;
    }
}

