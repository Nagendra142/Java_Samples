package Strivers.Arrays;

public class LargestSubArray {
    public static void main(String[] args) {
        int[] arr={-3,1,-3,4,-1,2,1,-5,4};
        int count=0,i=0,initial=0,end=0;
        int max=0,sum=0,temp=0;
        while(i<arr.length){
            sum=sum+arr[i];
            if(max<sum){
                max=sum;
                count=temp;
                end=i;
            }
            else if(sum<0){
                sum=0;
                count=0;
                initial=i;
            }
            i++;
            temp++;

        }
        System.out.println(max+" "+count);
        for(int k=initial+1;k<=end;k++){
            System.out.print(arr[k]+" ");
        }
    }
}
