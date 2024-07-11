package Strings;

public class Length {
    public static void main(String args[]){
        String a="Nagendra";
        int i=0;
        // while(!a.isEmpty()){
        //     i+=1;
        //     a=a.substring(1);
        // }
        // System.out.println(i);
        try{
            while(true){
                i+=1;
                a.charAt(i);
            }
        }
        catch(Exception ae){
            System.out.println(ae);
        }
        System.out.println(i);
    }
}
