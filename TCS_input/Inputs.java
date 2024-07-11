
package TCS_input;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Inputs {
    public static void main(String args[]){
        // Case 1: [1,2,3,4,5]
        // Case 2: 1 2 3 4 5
        // Case 3: 1,2,3,4,5
        int[] a={3,89,0,98};
        System.out.println(Arrays.toString(a));
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter the [] arrayvalues");
        String str=sc.nextLine();
        ArrayList<Integer> arr=BracketArray(str);
        System.out.println(arr);
        //
        System.out.println("Enter comma separated values:");
        String s=sc.nextLine();
        ArrayList<Integer> list=CommaSeparated(s);
        System.out.println(list);

        ArrayList<Integer> l=SpaceSeparated();
        System.out.println(l);

        System.out.println(WithOutSize());
    }
    // Case 1: [1,2,3,4,5]
    public static ArrayList<Integer> BracketArray(String st){
        ArrayList<Integer> list=new ArrayList<>();
        char[] charArray=st.toCharArray();
        for(char i:charArray){
            if(Character.isDigit(i)){
                list.add((int)i-'0');
            }

        }
        return list;
    }
    // Case 3: 1,2,30,40,5
    public static ArrayList<Integer> CommaSeparated(String st){
        String[] stringarray=st.split(",");
        ArrayList<Integer> lis=new ArrayList<>();
        for(String i:stringarray){
            if(i!=" "){
                lis.add(Integer.parseInt(i));
            }
        }
        return lis;
    }

    public static ArrayList<Integer> SpaceSeparated(){
        System.out.println("Enter space separeated values:");
        Scanner scanner=new Scanner(System.in);
        ArrayList<Integer> lis=new ArrayList<>();
        String space=scanner.nextLine();
        Scanner sc2=new Scanner(space);
        System.out.println(sc2);
        while(sc2.hasNextInt()){
            lis.add(sc2.nextInt());
        }
        return lis;
    }

    public static ArrayList<Integer> WithOutSize(){
        System.out.println("Withoutsize:");
        Scanner sc3=new Scanner(System.in);
        ArrayList<Integer> li=new ArrayList<>();
        String sa=sc3.nextLine();
        Scanner scx=new Scanner(sa);

        while(scx.hasNextInt()){
            li.add(scx.nextInt());
        }
        return li;
    }

}
