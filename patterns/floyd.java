package patterns;

public class floyd {
    public static void main(String[] args) {
        int n=5;
        int k=1;
        for(int i=0;i<n;i++){
            for(int l=0;l<n-i;l++){
                System.out.print(" ");
            }
            for(int j=1;j<=k;j++){
                System.out.print(j);
            }
            k+=2;
            System.out.println();
        }
        // System.out.println(k);
        k=k-4;
        for(int i=0;i<=n-1;i++){
            for(int l=0;l<=i+1;l++){
                System.out.print(" ");
            }
            for(int j=1;j<=k;j++){
                System.out.print(j);
            }
            k-=2;
            System.out.println();
        }
        
    }
}
