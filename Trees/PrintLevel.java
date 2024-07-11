package Trees;
import java.util.*;
public class PrintLevel {
    public static void main(String args[]){
        Prepared obj=new Prepared();
        obj.insert(8);
        obj.insert(3);
        obj.insert(10);
        obj.insert(1);
        obj.insert(6);
        obj.insert(4);
        obj.insert(7);
        obj.insert(14);
        obj.insert(13);
        obj.Height();
        obj.LevelOrder();
        
        
    }
    
}

class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data=data;
        left=null;
        right=null;
    }
}
class Prepared{
    Node root;
    void insert(int val){
        root=insert(root,val);
    }
    Node insert(Node root,int v){
        if(root==null){
            Node node=new Node(v);
            return node;
        }
        else if(v<root.data){
            root.left=insert(root.left,v);
        }
        else {
            root.right=insert(root.right,v);
        }
        return root;
    }

    void LevelOrder(){
        LevelOrder(root);
    }
    void LevelOrder(Node root) {
        if (root == null)
            return;
        
        Queue<Node> que = new LinkedList<>(); // Use LinkedList as Queue
        que.add(root);
        
        while (!que.isEmpty()) {
            int size = que.size(); // Store the current size of the queue
            for (int i = 0; i < size; i++) {
                Node temp = que.remove(); // Remove the front of the queue
                System.out.print(temp.data + " ");
                
                if (temp.left != null)
                    que.add(temp.left);
                if (temp.right != null)
                    que.add(temp.right);
            }
        }
    }
    


    
     void inorder(){
         inorder(root);
     }
     void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
       inorder(root.right);
     }
     void Height(){
        int hei=Height(root);
        System.out.println("Height of the Tree is "+hei);
     }
     int Height(Node nod){
        if(nod==null){
            return 0;
        }
        else{
            int left=Height(nod.left);
            int right=Height(nod.right);

        
        return Math.max(left,right)+1;
        }
     }

    
}
