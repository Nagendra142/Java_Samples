package TCS_interview.basics;

public class SsecondMax {
    public static void main(String... args){
        int[] arr={2,5,1,8,0,56,90};
        // int max1=Integer.MAX_VALUE;
        // int max2=Integer.MAX_VALUE;
        int max1=arr[0];
        int max2=arr[0];
        for(int i=0;i<arr.length;i++){
           if(arr[i]<max1){
            max2=max1;
            max1=arr[i];
           }
        }
        System.out.println("max1:"+max1+"  max2:"+max2);
    }
}
