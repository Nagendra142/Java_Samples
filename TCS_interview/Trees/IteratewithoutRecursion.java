package TCS_interview.Trees;
import java.util.*;
public class IteratewithoutRecursion {
    public static void main(String... args){
        Oper obj=new Oper();
        obj.Insert(20);
        obj.Insert(13);
        obj.Insert(67);
        obj.Insert(12);
        obj.Insert(78);
        obj.Insert(2);
        // obj.preOrder();
        obj.Iteration_PreOrder();
    }
}

class Tree{
    Tree left;
    Tree right;
    int data;
    public Tree(int val){
        this.data=val;
    }
}

class Oper{
    Tree root;
    void Insert(int val){
        root=Insert(root,val);
    }
    Tree Insert(Tree node,int val){
        if(node==null){
            return new Tree(val);
        }
        if(val<node.data){
            node.left=Insert(node.left,val);
        }
        else{
            node.right=Insert(node.right,val);
        }
        return node;
    }
    // void preOrder(){
    //     preOrder(root);
    // }
    // void preOrder(Tree node){
    //     if(node==null){
    //         return;
    //     }
    //     else{
    //         System.out.println(node.data);
    //         preOrder(node.left);
    //         preOrder(node.right);
    //     }
    // }
    void Iteration_PreOrder(){
        Stack<Tree> stack=new Stack<>();
        Tree temp=root;
        stack.push(temp);
        do{
            temp=stack.pop();
            System.out.print(temp.data+" ");
            if(temp.right!=null){// initially push the right side
                stack.push(temp.right);
            }
            if(temp.left!=null){ //after push right side node then left because it is stack so pop the last inserted ele so it will pop
                stack.push(temp.left);
            }
        }
        while(!stack.isEmpty());
    }
}
