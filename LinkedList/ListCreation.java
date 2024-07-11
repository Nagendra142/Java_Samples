package LinkedList;
class Node{
    int data;
    Node next;
    public Node(int val){
        this.data=val;
        this.next=null;
    }
}
class Implimentation{
    Node head;
    void insert(int val){
        Node node=new Node(val);
        if(head==null){
            head=node;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=node;
        }
    }
    void Show(){
        Node temp=head;
        while(temp!=null){
            System.out.print(" "+temp.data);
            temp=temp.next;
        }

    }
    void reverse(){
        Node prev=null;
        Node cur=head;
        Node Nextele=cur.next;
        while(cur!=null){
            cur.next=prev;
            prev=cur;
            cur=Nextele;
            if(Nextele!=null){
                Nextele=Nextele.next;
            }
        }
        head=prev;
    }
}

public class ListCreation {
    public static void main(String ar[]){
        Implimentation obj=new Implimentation();
        obj.insert(0);
        obj.insert(1);
        obj.insert(2);
        obj.insert(4);
        obj.reverse();
        obj.Show();
    }
}
