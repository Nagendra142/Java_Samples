package Recursion;

public class MazeAllDir {
    public static void main(String[] args) {
        int[][] arr={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        boolean[][] check=new boolean[arr.length][arr[0].length];
        helper(arr,check,0,0," ");
    }
    static void helper(int[][] arr,boolean[][] check,int row,int column,String str){
        if(row<0 || row>arr.length-1 || column<0 || column>arr.length-1){
            return;
        }
        if(check[row][column]){
            return;
        }
        if(row==arr.length-1 && column==arr.length-1){
            System.out.println(str);
            return;
        }
        check[row][column]=true;
        if(row>0){
            helper(arr,check,row-1,column,str+"U");
        }
        if(row<arr.length){
            helper(arr,check,row+1,column,str+"D");
        }
        if(column>0){
            helper(arr,check,row,column-1,str+"L");
        }
        if(column<arr.length){
            helper(arr,check,row,column+1,str+"R");
        }
        check[row][column]=false;
    }
}
