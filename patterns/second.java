package patterns;

public class second {
    public static void main(String args[]){
        int n=10;
        int valu=n+(n-1);
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<valu;k++){
                System.out.print(i);
            }
            valu-=2;
            System.out.println();
        }
        
    }
}
