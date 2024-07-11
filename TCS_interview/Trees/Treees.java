package TCS_interview.Trees;
import java.util.*;
public class Treees {
    public static void main(String... args){
        Op obj=new Op();
        obj.Creation(10);
        obj.Creation(4);
        obj.Creation(45);
        obj.Creation(32);
        obj.Creation(40);
        obj.Creation(21);
        obj.Creation(12);

        obj.Level();
        obj.Height();
        // obj.MaxInBin();
        // obj.PreOrder();
    }
}
class NodeEle{
    int data;
    NodeEle left;
    NodeEle right;
    public NodeEle(int val){
        this.data=val;
    }
}

class Op{
    NodeEle root;
    void Creation(int val){
        root=Creation(root,val);
    }
    NodeEle Creation(NodeEle temp,int val){
        if(temp==null){
            return new NodeEle(val);
        }
        if(val<temp.data){
            temp.left=Creation(temp.left,val);
        }
        else{
            temp.right=Creation(temp.right,val);
        }
        return temp;
    }
    void PreOrder(){
        PreOrder(root);
    }
    void PreOrder(NodeEle temp){
        if(temp==null){
            return;
        }
        System.out.print(temp.data+" ");
        PreOrder(temp.left);
        PreOrder(temp.right);
    }
    void MaxRoot(){
        MaxRoot(root);
    }
    void MaxRoot(NodeEle temp){
        if(temp.right==null){
            System.out.println("Max element is "+temp.data);
            return;
        }
        else{
            MaxRoot(temp.right);
        }
    }
    void  MaxInBin(){
        int a=MaxInBin(root,Integer.MIN_VALUE);
        System.out.println(a);
    }
    int MaxInBin(NodeEle temp,int val){
        if(temp==null){
            return val;
        }
        if(val<temp.data){
            val=temp.data;
            // System.out.println(val);
            return val;
        }
        MaxInBin(temp.left,val);
        MaxInBin(temp.right,val);
        return val;
    }
    void Level(){
        System.out.println("Level order:");
        Level(root);
    }
    void Level(NodeEle temp){
        Queue<NodeEle> que=new LinkedList<>();
        // que.add(1);
        // que.add(2);
        // que.add(3);
        // que.add(4);
        // System.out.println(que);
        // System.out.println(que.remove());
        // System.out.println(que);
        // System.out.println(que.remove());
        if(temp!=null){
            que.add(temp);
            while(!que.isEmpty()){
                // System.out.println("queue:"+que);
                NodeEle a=que.remove();
                System.out.println(a.data);
                
                if(a.left!=null){
                    que.add(a.left);
                }
                if(a.right!=null){
                    que.add(a.right);
                }
            }
        }
    }
    void Height(){
        System.out.println(Height(root));
    }
    int Height(NodeEle temp){
        if(temp==null){
            return 0;
        }
        else{
       int a=Height(temp.left);
       int b=Height(temp.right);
       return Math.max(a,b)+1;
        }
    }
}
