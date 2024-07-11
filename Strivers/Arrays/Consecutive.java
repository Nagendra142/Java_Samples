package Strivers.Arrays;

public class Consecutive {
    public static void main(String[] args) {
        int[] arr={1,0,1,1,0,1,1,1};
        int op=0,count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
            }
            if(op<count){
                op=count;
            }
            if(arr[i]!=1){
                count=0;
            }
        }
        System.out.println(op);
    }
}
