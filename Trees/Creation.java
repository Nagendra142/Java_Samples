package Trees;

class Tree{
    int data;
    Tree left;
    Tree right;
    public Tree(int data){
        this.data=data;
        left=null;
        right=null;
    }
}

public class Creation {
    public static void main(String args[]){
        Implimentation obj=new Implimentation();
        obj.insert(5);
        obj.insert(3);
        obj.insert(9);
        obj.insert(1);
        obj.insert(89);
        System.out.println("Inorder::");
        obj.inorder();
        System.out.println("\npreorder::");
        obj.preorder();
        System.out.println("\npostorder::");
        obj.postorder();
    }
}
class Implimentation{
    Tree root;
    void insert(int val){
        root=insert(root,val);
    }
    Tree insert(Tree root,int v){
        if(root==null){
            Tree node=new Tree(v);
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
     void inorder(){
         inorder(root);
     }
     void inorder(Tree root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
       inorder(root.right);
     }

     void preorder(){
        preorder(root);

     }
     void preorder(Tree node){
        if(node==null){
            return;
        }
        System.out.print(node.data+" ");
        preorder(node.left);
        preorder(node.right);
     }
     void postorder(){
        postorder(root);

     }
     void postorder(Tree node){
        if(node==null){
            return;
        }
        
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data+" ");
     }
}
