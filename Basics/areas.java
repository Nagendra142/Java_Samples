package Basics;
import java.net.SocketPermission;
import java.util.Scanner;
public class areas {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the option");
    System.out.println("\n'Triangle'\n'Square'\n'Circle'\n'Rectangle'\n'Parallelogram'");
    String str=sc.next();
    switch(str){
        case "Triangle"->{
            System.out.println("Enter the height and base::");
            System.out.printf("%f",(sc.nextInt()*sc.nextInt()));
        }
        case "Square"->{
            System.out.println("Enter the side::");
            System.out.printf("%f",(Math.pow(sc.nextInt(),2)));
        }
        case "Circle"->{
            System.out.println("Enter the radius::");
            System.out.printf("%f",(22/7 *Math.pow(sc.nextInt(),2)));
        }
        case "Rectangle"->{
            System.out.println("Enter the length and width::");
            System.out.printf("%f",(Math.pow(sc.nextInt(),2)));
        }
        case "Parallelogram"->{
            System.out.println("Enter the length and width::");
            System.out.printf("%f",(Math.pow(sc.nextInt(),2)));
        }
        default->{
            System.out.println("My Bad luck your option not valid please checkm once again");
        }
    }
    }
}
