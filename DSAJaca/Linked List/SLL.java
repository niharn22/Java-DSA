import java.util.*;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class SLL {

    Node head;

    public void insert(int data){
        Node newNode = new Node(data);

        if(head==null) head = newNode;
        else{
            Node temp = head;
            while(temp.next!=null) temp = temp.next;
            temp.next = newNode;
        }
    }

    public void delete(int data){
        if(head==null) return;
        if(head.data == data){
            head = head.next;
            return;
        }

        Node temp = head;
        while(temp.next!=null && temp.next.data!=data){
            temp = temp.next;
        }
        if(temp.next!=null){
            temp.next = temp.next.next;
        }
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        SLL list = new SLL();

        // insert elements
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        System.out.println("Linked List");
        list.display();

        list.delete(20);
        System.out.println("After deleting 20");
        list.display();
    }
}
