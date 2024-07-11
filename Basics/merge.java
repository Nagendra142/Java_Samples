package Basics;
import java.util.Arrays;
public class merge {
    public static void main(String args[]){
        int[] arr={5,3,7,1,9,0,2};
        merge.separation(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void separation(int[] ar,int start,int end){
        if(start<end){
            int mid=start+(end-start)/2;
            separation(ar,start,mid);
            separation(ar,mid+1,end);
            merge.mergesort(ar,start,mid,end);
        }
    }
    static void mergesort(int[] arr,int st,int mid,int last){
        int i=mid-st+1;
        int j=last-mid;
        int[] temp1=new int[i];
        int[] temp2=new int[j];
        for(int k=0;k<i;k++){
            temp1[k]=arr[st+k];
        }
        for(int l=0;l<j;l++){
            temp2[l]=arr[mid+l+1];
            //note this
        }
        int m=st;  //****starts with initial value 
        int iter=0;int jre=0;
        while(iter<i && jre<j){
            if(temp1[iter]>temp2[jre]){
                arr[m]=temp2[jre];
                jre+=1;
                m+=1;
            }
            else{
                arr[m]=temp1[iter];
                m+=1;
                iter+=1;
            }
        }
        while(iter<i){
            arr[m]=temp1[iter];
            iter+=1;
            m+=1;
        }
        while(jre<j){
            arr[m]=temp2[jre];
            jre+=1;
            m+=1;
        }

    }

}
