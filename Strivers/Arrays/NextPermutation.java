package Strivers.Arrays;

import javax.print.attribute.standard.PagesPerMinute;
import java.util.*;
public class NextPermutation {
    static ArrayList<ArrayList<Integer>> list=new ArrayList<>();
    public static void main(String[] args) {
        int[] arr={2,3,1};
        Arrays.sort(arr);
       Permutation(arr,0,arr.length-1,new ArrayList<Integer>());
       for(ArrayList<Integer> inner:list){
        System.out.println(inner);
       }
    }
    static void Permutation(int[] ar,int s,int l,ArrayList<Integer> li){
        if(li.size()==ar.length){
            list.add(li);
            System.out.println("list:"+li);
            return;
        }
        for(int i=0;i<ar.length;i++){
            li.add(ar[i]);
            Permutation(ar, i+1, l, li);
            li.remove(li.size()-1);
        }
    }
}
