import java.util.*;
public class FrogJump {
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] dp=new int[n+1];
        for(int i=0;i<=n;i++){
            dp[i]=-1;
        }
        int val=Mini_Energy(n-1, arr,dp);
        System.out.println(val);

    }
    static int Mini_Energy(int n,int[] arr,int[] dp){
        if(n==0)
        return 0;
        if(n==1)
        return Math.abs(arr[1]-arr[0]);
        if(dp[n]!=-1)
        return dp[n];
        int s1=Math.abs((arr[n]-arr[n-1])+Mini_Energy(n-1, arr,dp));
        int s2=Math.abs((arr[n]-arr[n-2])+Mini_Energy(n-2, arr,dp));
        dp[n]=Math.min(s1,s2);
        return dp[n];
    }
    
}


