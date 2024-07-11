package Strivers.Arrays;

public class PascalTri {
    public static void main(String[] args) {
        int n=6;
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if(i==0 || j==0 || j==i){
                    arr[i][j]=1;
                }
                else{
                    arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        System.out.println("With Spaces ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n-(i+1);j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
