package Strivers.Arrays;
import java.util.*;
public class DetermineHighest {
    public static void main(String[] args) {
        int [] arr={4,4,2,4,3,4,4,3,2,4};
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(Integer val:map.keySet()){
            if(map.get(val)>(arr.length)/2){
                System.out.println((val));
                return;
            }
        }
    }
}
