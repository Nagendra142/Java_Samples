package TCS_interview.Trees;

public class Creation {
    public static void main(String... args){
        Implim obj=new Implim();
        obj.Insert(10);
        obj.Insert(4);
        obj.Insert(45);
        obj.Insert(32);
        obj.Insert(40);
        obj.Insert(21);
        obj.Insert(12);
        obj.preorder();
    }
}
class TreeNode{
    int data;
    TreeNode leftNode;
    TreeNode rightNode;
    public TreeNode(int val){
        this.data=val;
    }
}

class Implim{
    TreeNode root;
    void Insert(int val){
        root=Insert(root,val);
    }
    TreeNode Insert(TreeNode temp,int val){
        if(temp==null){
            return new TreeNode(val);
        }
        if(val<temp.data){
            temp.leftNode=Insert(temp.leftNode,val);
        }
        else{
            temp.rightNode=Insert(temp.rightNode,val);
        }
        return temp;
    }

    void preorder(){
        preorder(root);
    }
    void preorder(TreeNode temp){
        if(temp==null){
            return;
        }
        else{
            System.out.print(temp.data+" ");
            preorder(temp.leftNode);
            preorder(temp.rightNode);
        }
    }
}
