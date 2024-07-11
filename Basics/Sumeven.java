package Basics;

public class Sumeven {
    public static void main(String args[]){
        int[] arr={2,3,4,5,1,2,3,6};
        System.out.println(new Sumeven().Sum(arr,0,0));

    }
    int Sum(int[] arr,int s,int su){
        if(s==arr.length){
            return su;
        }
        if(s%2==0){
            su+=arr[s];
        }
        return Sum(arr,s+1,su);
    }
}
