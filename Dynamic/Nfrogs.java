import java.util.*;
public class Nfrogs {
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int val=Frogs_Jump(n-1, arr, k);
        System.out.println(val);
    }
    static int Frogs_Jump(int n,int[] arr,int k){
        if(n==0){
            return 0;
        }
        if(n==1){
            return Math.abs(arr[0]-arr[1]);
        }
        int Min_Energy=Integer.MAX_VALUE;
        for(int i=1;i<=k;i++){
            if(n-i>=0){
            int val=Math.abs(arr[n]-arr[n-i])+Frogs_Jump(n-i,arr,k);
            Min_Energy=Math.min(val,Min_Energy);
            }
        }
        return Min_Energy;
    }
}
