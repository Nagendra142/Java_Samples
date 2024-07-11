
package TCS_interview.Linkedlist;

public class MergeSort {
    public static void main(String... args){
        Operation obj=new Operation();
        Node a=obj.Insert(0);
        obj.Insert(3);
        obj.Insert(7);
        obj.Insert(8);
        obj.Insert(10);
        obj.Insert(45);
        obj.Insert(90);
        new Merge().Display(a);
        System.out.println();
        Operation obj2=new Operation();
        Node b=obj2.Insert(2);
        obj2.Insert(9);
        obj2.Insert(89);
        obj2.Insert(98);
        new Merge().Display(b);
        Merge merg=new Merge();
        System.out.println();
        merg.Display(merg.Merge_sort(a, b));



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

class Operation{
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
            temp=temp.next;
        }
        return temp;
    }
    // void Display(){
    //     Node temp=head;
    //     while(temp!=null){
    //         System.out.print(temp.value+"-->");
    //         temp=temp.next;
    //     }
    //     System.out.print("null");
    // }
}
class Merge{
    void Display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"-->");
            temp=temp.next;
        }
        System.out.print("null");
    }
    Node Merge_sort(Node a,Node b){
       
        Node head=null;
        Node temp=null;
        while(a!=null && b!=null){
            if(a.value<b.value){
                if(head==null){
                    head=a;
                    temp=head;
                    a=a.next;
                }
                else{
                    temp.next=a;
                    temp=temp.next;
                    a=a.next;
                }
            }
            else{
                if(head==null){
                    head=b;
                    temp=head;
                    b=b.next;
                }
                else{
                    temp.next=b;
                    temp=temp.next;
                    b=b.next;
                }
            }
        }
        if(a!=null){
            temp=a;
        }
        else{
            temp=b;
        }
        return head;
    }

}
