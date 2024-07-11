import java.util.*;

class Solution {
    static boolean flag=false;
  public static void main(String[] args) {
    // Write your code here...
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int tar=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    
    SubSe(arr,tar,new ArrayList<Integer>() ,0,0);
  }
  static void SubSe(int[] arr,int tar,ArrayList<Integer> list,int sum,int start){
      if(sum==tar){
          for(int a:list)
          System.out.print(a+" ");
          System.out.println();
          flag=true;
          return;
      }
      if(sum>tar)
      return;
      if(flag)
      return;
      for(int i=start;i<arr.length;i++){
          list.add(arr[i]);
          SubSe(arr,tar,list,sum+arr[i],i+1);
          list.remove(list.size()-1);
      }
      
  }
}