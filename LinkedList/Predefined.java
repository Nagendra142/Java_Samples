package LinkedList;
import java.util.LinkedList;

public class Predefined {
    public static void main(String a[]){
        LinkedList node=new LinkedList();
        node.add("10");
        node.add("20");
        node.add(1,"34");
        node.add(0,"12");
        node.add("Mango");
        
        // index remove
        // node.remove(2);
        // based on value remove 
        // node.remove("Mango");
        // node.remove("10");
        System.out.println(node.contains("10"));
        System.out.println(node.size());
        for(Object v:node){
            System.out.println(v);
        }
    }
}
