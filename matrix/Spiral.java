package matrix;

public class Spiral {
    public static void main(String... args){
        int[][] arr={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        int len=arr.length;
        for(int i=0;i<(arr.length)/2;i++){
            for(int j=0;j<len-i;j++){
                System.out.print(arr[i][j]);
            }
            for(int k=i+1;k<len-i;k++){
                System.out.print(arr[k][len-i+1]);
            }
            for(int l=len-i+1;l>=i;l--){
                System.out.print(arr[len-i+1][l]);
            }
            for(int m=len-i+1;m>i;m--){
                System.out.print(arr[m][i]);
            }
        }
    }
}
