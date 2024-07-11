package Strings;

public class withoutLength {
    public static void main(String args[]){
    String str="asc";
    int i=0;
    while(str!=null && !str.isEmpty()){
        str=str.substring(1);
        i+=1;
    }
    System.out.println(i);
    // try{
    // while(true){
    //     str.charAt(i);
    //     i+=1;
    // }
    // }
    // catch(StringIndexOutOfBoundsException e){
    //     System.out.println(i);
    // }

}
}
