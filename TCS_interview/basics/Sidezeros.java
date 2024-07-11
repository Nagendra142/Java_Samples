package TCS_interview.basics;

public class Sidezeros {
    public static void main(String args[]){
        int arr[]={8,9,0,47,2,0,0,4,0,2,0,0,2};
        int zeros=0,non_zero=0;
        int i=0;
        while(non_zero<arr.length){
            if(arr[non_zero]==0){
                non_zero++;
            }
            else if(zeros!=non_zero){
                int a=arr[non_zero];
                arr[non_zero]=arr[zeros];
                arr[zeros]=a;
                zeros+=1;
                non_zero=zeros;

            }
            else{
                zeros++;
                non_zero++;
            }
        }
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }
}
