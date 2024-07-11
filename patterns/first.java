package patterns;

public class first {
    public static void main(String args[]){
        int n=4;
        int ite=1;
    for(int i=1;i<=n;i++){
        for(int j=0;j<=n-i;j++){
            System.out.print(" ");
        }
        
        for(int lm=0;lm<ite;lm++){
            System.out.print(i);
        }
        ite+=2;
        System.out.println();
    }
    }
}
