package Strings;
import java.util.Arrays;
import java.util.Scanner;
public class SortStrings {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] arr=str.split(" ");
        // Arrays.sort(arr);
        // System.out.print(Arrays.toString(arr));
        // // System.out.println(Arrays.sort(arr));
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i].compareToIgnoreCase(arr[j])>0){
                    String temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}