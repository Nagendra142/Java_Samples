package Strivers.Arrays;

import java.util.*;

public class Permutation {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        Fun(arr,0);
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(3, 2, 1));
        System.out.println(l.contains(a));
    }
    static ArrayList<ArrayList<Integer>> l=new ArrayList<>();
    static void Fun(int[] arr,int comp){
        if(comp>=arr.length){
            ArrayList<Integer> li=new ArrayList<>();
            for(int num:arr){
                li.add(num);
            }
            l.add(li);
            return;
        }
        for(int i=comp;i<arr.length;i++){
            swap(arr,i,comp);
            Fun(arr,comp+1);
            swap(arr,i,comp);
        }
    }
    static void swap(int[] arr,int v,int val){
        int temp=arr[v];
        arr[v]=arr[val];
        arr[val]=temp;
    }
}
