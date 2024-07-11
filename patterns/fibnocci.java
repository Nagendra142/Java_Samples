package patterns;

public class fibnocci {
    public static void main(String args[]){
        int n=5;
        int a=0,b=1,temp=1;
    for(int i=0;i<n;i++){
        for(int j=0;j<=i;j++){
            System.out.printf("%d ",b);
            a=b;
            b=temp;
            temp=a+b;
        }
        System.out.println();
    }
    }
}
