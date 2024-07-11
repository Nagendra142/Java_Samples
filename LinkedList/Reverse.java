package LinkedList;

class Element{
    Element next;
    int data;
    public Element(int val){
        this.data=val;
    }
}
class EleIm{
    Element head;
    void Insert(int val){
        Element node=new Element(val);
        if(head==null){
            head=node;
        }
        else{
            Element temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=node;
        }
    }
    void Print1(){
        Element temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    void Rev(){
        Element prev=null;
        Element cur=head;
        Element next=cur.next;
        while(cur!=null){
            cur.next=prev;
            prev=cur;
            cur=next;
            if(next!=null){
                next=next.next;
            }
        }
        head=prev;
    }
}
public class Reverse {
    public static void main(String... args){
        EleIm obj=new EleIm();
        obj.Insert(0);
        obj.Insert(2);
        obj.Insert(3);
        obj.Insert(4);
        obj.Insert(5);
        obj.Print1();
        obj.Rev();
        System.out.println();
        obj.Print1();
    }
}
