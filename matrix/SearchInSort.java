package matrix;

public class SearchInSort {
    public static void main(String... arg){
        int[][] arr={
    {10,20,30,40},
    {15,25,35,45},
    {27,29,37,48},
    {32,33,39,51}};
        Found(arr,48);

    }
    static void Found(int[][] arr,int key){
        int a=0;
        int b=arr.length-1;
        while(b>=0 && a<arr[0].length){
            if(arr[a][b]==key){
                System.out.println("Element found at indexes "+a+" "+b);
                return;
            }
            if(arr[a][b]>key){
                b--;
            }
            else{
                a++;
            }
        }
    }
}
