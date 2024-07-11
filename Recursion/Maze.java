package Recursion;
public class Maze {
    public static void main(String[] args) {
        int[][] arr={
            {1,3,4},
            {6,3,9},
            {11,14,14},
            // {16,17,18,19},
            // {21,22,23,24,25}
        };
        helper(arr,0,0," ");
    }
    static void helper(int[][] arr,int row,int column,String s){
        if(row>arr.length-1 || arr.length<column-1){
            return;
        }
        // if(arr[row][column]==3){
        //     return;
        // }
        if(row==arr.length-1 && column==arr.length-1){
            System.out.println(s);
            return;
        }
        helper(arr,row+1,column,s+"D");
        helper(arr,row,column+1,s+"R");
    }
}
