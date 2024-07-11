package TCS_interview.basics;

public class TimeComplexity {
    // it takes 0 milliseconds
    public static void main(String args[]){
        double now=System.currentTimeMillis();
        int n=99999;
        int sum=n*(n+1)/2;
        System.out.println("Time taken by this method is :"+(System.currentTimeMillis()-now)+" output is:"+sum);
    }

    // it takes 1 millisecond
    // public static void main(String args[]){
    //     double now=System.currentTimeMillis();
    //     int n=99999;
    //     int sum=0;
    //     for(int i=0;i<=n;i++){
    //         sum+=i;
    //     }
    //     System.out.println("Time taken by this method is :"+(System.currentTimeMillis()-now)+" output is:"+sum);
    // }
}
