package TCS_interview.Linkedlist;

public class Remove_dup {
    public static void main(String... args){
        Implimentation obj=new Implimentation();
        obj.Insert(0);
        obj.Insert(1);
        obj.Insert(1);
        obj.Insert(2);
        obj.Insert(3);
        obj.Insert(3);
        obj.Insert(3);
        // obj.Insert(4);
        obj.Remove_duplicate();
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

    void Insert(int val){
        if(head==null){
            head=new Node(val);
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            Node a=new Node(val);
            temp.next=a;
        }
    }
    void Display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"-->");
            temp=temp.next;
        }
        System.out.print("null");
    }
    void Remove_duplicate(){
        Node temp=head;
        while(temp.next!=null){
            if(temp.value==temp.next.value){
                temp.next=temp.next.next;
            }
            else{
                temp=temp.next;
            }
        }
    }
}
