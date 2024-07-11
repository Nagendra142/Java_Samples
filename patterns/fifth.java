package patterns;

public class fifth {
    public static void main(String[] args) {
        int n=6;
        int l=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print(l);
                l++;
            }
            for(int k=0;k<i;k++){
                l--;
                System.out.print(l-1);
                
            }
            System.out.println();
        }
    }
}
