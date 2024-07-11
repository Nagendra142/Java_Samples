package TCS_interview.Linkedlist;

class Node{
    Node next;
    int value;
    public Node(int val){
        this.next=null;
        this.value=val;
    }
}

class Routing{
    public static void main(String... args){
        Creation cr=new Creation();
        cr.Insert(3);
        cr.Insert(4);
        cr.Insert(7);
        // cr.Position(45,0);
        
        cr.Insert(90);
        // cr.Reverse();
        cr.Insert(12);
        cr.Part_pos_node(4);
        cr.Display();

    }


}

public class Creation {
    
    Node head=null;
    Node temp_next=null;
    // insert value
    void Insert(int val){
        if(head==null){
            head=new Node(val);
            // temp_next=head;
        }
        // else{
        //     Node extra=new Node(val);
        //     temp_next.next=extra;
        //     temp_next=extra;
        // }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            Node a=new Node(val);
            temp.next=a;
        }
    }
    void Position(int val,int pos){
        if(pos==0){
            Node nod=new Node(val);
            nod.next=head;
            head=nod;
            return;
        }
        Node temp=head;
        if(head==null){
            return;
        }
        int count=0;
        Node prev=null;
        Node next=head;
        while(temp.next!=null){
            prev=next;
            next=next.next;
            if(count==pos-1){
                Node n=new Node(val);
                prev.next=n;
                n.next=next;
                break;
            }
            count++;
        }
    }
    void Part_pos_node(int pos){
        if(head==null){
            return;
        }
        int count=0;
        Node prev=null;
        Node next=head;
        while(count<pos-1){
            prev=next;
            next=next.next;
            count++;
        }
        prev.next=next.next;
    }
    void Display(){
        Node temp=head;
        while(temp.next!=null){
            System.out.println(temp.value);
            temp=temp.next;
        }
        System.out.println(temp.value);

    }
    void Reverse(){
        if(head==null || head.next==null){
            System.out.println("less elements");
            return;
        }
        Node prev=null;
        Node cur=head;
        Node next_Node=cur.next;
        while(cur!=null){
            // prev.next=cur;
            cur.next=prev;
            prev=cur;
            cur=next_Node;
            if(next_Node!=null){
                next_Node=next_Node.next;
            }
        }
        head=prev;
    }
}
