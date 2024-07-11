package TCS_interview.Linkedlist;

public class Circularsingle {
    public static void main(String... args){
        Impl obj=new Impl();
        obj.Insert(0);
        obj.Insert(1);
        obj.Insert(2);
        obj.Insert(3);
        obj.Display();
    }
}

class Nod{
    int data;
    Nod next;
    public Nod(int val){
        this.data=val;
        this.next=null;
    }
}

class Impl{
    Nod head=null;

    void Insert(int val){
        if(head==null){
            Nod a=new Nod(val);
            head=a;
            head.next=a;
        }
        else{
            Nod temp=head;
            Nod prev=null;
            do{
                prev=temp;
                temp=temp.next;
            }
            while(temp!=head);
            Nod a=new Nod(val);
            prev.next=a;
            a.next=head;
        }
    }
    void Display(){
        Nod temp=head;
        do{
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        while(temp!=head);
    }
}

