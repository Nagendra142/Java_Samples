package TCS_interview.basics;

public class FindMissingInRange {
    public static void main(String... args){
        int[] arr={2,7,5,3,1,4,8}; //here 6 missing in range 1 to 7
        int i=0;
        while(i<arr.length){
            if(arr[i]!=i+1 && arr[i]<arr.length && arr[i]!=arr[arr[i]-1]){
                int a=arr[i];
                arr[i]=arr[arr[i]-1];
                arr[a-1]=a; //be care here the element updated so arr[arr[i]-1] will give updated array value so take arr[a-1] instead of arr[arr[i]-1]
            }
            else
            i++;
            // System.out.println();
        }
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
       for(int k=0;k<arr.length;k++){
        if(arr[k]!=k+1){
            System.out.println("\n"+(k+1));
            break;
        }
       }
    }
}
