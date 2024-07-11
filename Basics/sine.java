package Basics;
import java.util.*;
public class sine {
    public static void main(String args[]){
        // System.out.println(Math.sin(0.5));
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the x,y,and z coordinates:");
        // int x=sc.nextInt(),y=sc.nextInt(),z=sc.nextInt();
        String str=sc.next();//3x^2+2x^1+x;
        String[] arr=str.split("\\+");
        System.out.println();
        String x1[]=arr[0].split("x");
        String y1[]=arr[1].split("x");
        String z1=arr[2];
        int x=Integer.parseInt(x1[0]);
        int y=Integer.parseInt(y1[0]);
        int z=Integer.parseInt(z1);
        float b=(float)(y*y-4*x*z);
        System.out.println(b);
        float a=(float)(-y+Math.sqrt(Math.abs(b)))/2*x;
        // System.out.println((float)Math.sqrt(b));
        float a2=(float)(-y-Math.sqrt((Math.abs(b))))/2*x;
        System.out.println(a+" "+a2);
    }
}