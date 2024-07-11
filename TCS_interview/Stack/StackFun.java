package TCS_interview.Stack;

import java.util.EmptyStackException;

public class StackFun {
    public static void main(String... args){
        Imp obj=new Imp();
        obj.Push(0);;
        obj.Push(2);
        obj.Push(3);
        obj.Push(4);
        obj.pop();
        obj.peek();
        obj.Size();
    }
}

class sta{
    sta prev;
    int val;
    public sta(int val){
        this.prev=null;
        this.val=val;
    }
}

class Imp{
    int length=0;
    sta top=null;

    void Push(int val){
        sta a=new sta(val);
        try{
            a.prev=top;
            top=a;
            length++;
        }
        catch(Exception e){
            top=a;
            length++;
        }
        finally{
            System.out.println("Element added");
        }
    }
    void Size(){
        System.out.println("length of the stac is"+length);
    }
    void isEmpty(){
        if(length==0){
            throw new EmptyStackException();
        }
        else{
            System.out.println("its have elements");
        }
    }
    void pop(){
        if(length==0){
            System.out.println("No elements");
        }
        else{
            System.out.println(top.val+" deleted");
            top=top.prev;
            length--;
        }
    }
    void peek(){
        if(length==0){
            System.out.println("No element");
        }
        else{
            System.out.println(top.val+" top elemnt");
        }
    }

}
