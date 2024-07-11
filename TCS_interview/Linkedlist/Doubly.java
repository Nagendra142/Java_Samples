package TCS_interview.Linkedlist;

public class Doubly {
    public static void main(String... args){
        impliment obj=new impliment();
        obj.Insert(1);
        obj.Insert(2);
        obj.Insert(3);
        obj.Insert(4);
        obj.Display(); 
        System.out.println();
        obj.Tail();
    }
}

class Double{
    int data;
    Double prev;
    Double next;
    public Double(int data){
        this.data=data;
        this.prev=null;
        this.next=null;
    }
}

class impliment{
    Double head=null;
    Double tail=null;

    void Insert(int val){
        if(head==null){
            head=new Double(val);
        }
        else{
            Double temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            Double a=new Double(val);
            temp.next=a;
            a.prev=temp;
            tail=a;
        }
    }
    void Display(){
        Double temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.print("null");
    }
    void Tail(){
        Double temp=tail;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.prev;
        }
        System.out.print("null");
    }
}
