package TCS_interview.Linkedlist;

// package TCS_interview.Linkedlist;

public class Cycle_presents {
    public static void main(String... args){
        Implimentation obj=new Implimentation();
        Node a=obj.Insert(0);
        obj.Insert(1);
        obj.Insert(1);
        obj.Insert(2);
        obj.Insert(3);
        obj.Insert(3);
        obj.Insert(3);
        obj.Insert(4);
        // c.next=cir;
        obj.Display();
    }
}
class Node{
    Node next;
    int value;
    public Node(int val){
        this.next=null;
        this.value=val;
    }
}

class Implimentation{
    Node head=null;

    Node Insert(int val){
        Node temp=head;
        if(head==null){
            head=new Node(val);
            temp=head;
        }
        else{
            
            while(temp.next!=null){
                temp=temp.next;
            }
            Node a=new Node(val);
            temp.next=a;
            temp=a;
        }
        return temp;
    }
    void Display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"-->");
            temp=temp.next;
        }
        System.out.print("null");
    }
    
}
