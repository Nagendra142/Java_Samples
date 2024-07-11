package Strivers.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
public class SetMatrixZeros {
    public static void main(String[] args) {
        int[][] arr={
            {1,2,1},
            {1,0,8},
            {4,8,9}
        };
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        int l=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==0){
                    ArrayList<Integer> li=new ArrayList<>();
                    li.add(i);
                    li.add(j);
                    list.add(li);
                }
            }
        }
        System.out.println(list);
        for(ArrayList<Integer> inner:list){
                for(int k=0;k<arr.length;k++){
                    arr[inner.get(0)][k]=0;
                    arr[k][inner.get(1)]=0;
                }
        }
        for(int o=0;o<arr.length;o++)
        System.out.println(Arrays.toString(arr[o]));
    }
}
