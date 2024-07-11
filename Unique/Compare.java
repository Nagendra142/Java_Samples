package Unique;
import java.util.*;
public class Compare {
    public static void main(String... args){
        String[] arr={"nag","ravi","agadu","swami"};
        int[] a={9,8,67,90};
        Extra[] ex=new Extra[arr.length];
        for(int i=0;i<arr.length;i++){
           ex[i]=new Extra(arr[i],a[i]);
        }
        for(int i=0;i<ex.length;i++){
            System.out.println(ex[i].pow+" "+ex[i].weight);
        }
        System.out.println("After Sorting:");
        Arrays.sort(ex,(x,y)->x.pow.compareTo(y.pow));
        for(Extra e:ex){
            System.out.println(e.pow+" "+e.weight);
        }
    }
}
class Extra{
    String pow;
    int weight;
    public Extra(String a,int b){
        this.pow=a;
        this.weight=b;
    }
}
