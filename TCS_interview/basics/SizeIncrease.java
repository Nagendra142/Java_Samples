package TCS_interview.basics;

public class SizeIncrease {
    public static void main(String... args){
        int arr[]={1,2,4,5};
        // if want to increase size then create extra array with high size and put all elements in that
        int[] extrasize=new int[arr.length*2];
        for(int i=0;i<arr.length;i++){
            extrasize[i]=arr[i];
        }
        arr=extrasize;
        // can add extra elements
        arr[6]=9;
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
