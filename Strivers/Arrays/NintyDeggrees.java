package Strivers.Arrays;
import java.util.*;
public class NintyDeggrees {
    public static void main(String[] args) {
        int[][] arr={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int[][] dummy=new int[arr.length][arr[0].length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                dummy[j][arr.length-1-i]=arr[i][j];
            }
        }
        // 
        for(int[] num:arr){
            System.out.println(Arrays.toString(num));
        }
    }
}
