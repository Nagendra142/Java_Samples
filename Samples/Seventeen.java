public class Seventeen {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print((char)(65+k));
            }
            for(int k=i-1;k>=0;k--){
                System.out.print((char)(65+k));
            }
            System.out.println();
        }
    }
}
