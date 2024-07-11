package Basics;
import java.util.*;
public class CopyEle {
    public static void main(String... args){
        int[] ar={9,0,5};
        
        int[] br=ar;
        System.out.println(Arrays.toString(br));
        System.out.println(Arrays.toString(ar));
    }
}
