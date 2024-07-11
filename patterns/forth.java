package patterns;
public class forth {
    public static void main(String args[]){
        int n=5;
        for(int i=1;i<=n/2+1;i++){
            for(int j=0;j<n/2+1-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<i;k++){
                System.out.print(i);
            }
            System.out.println();
        }
        int lm=1;
        for(int i=n/2+1;i<n;i++){
            for(int j=0;j<lm;j++){
                System.out.print(" ");
            }
            lm+=1;
            for(int k=0;k<n-i;k++){
                System.out.print(n-i);
            }
            System.out.println();
        }
    }
}
