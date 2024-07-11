package Basics;
import java.util.Scanner;
public class SumSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int sum=0,fac=1;
        for(int i=1;i<=a;i++){
            fac*=i;
            sum+=fac;
        }
        System.out.println(sum);
    }
}
