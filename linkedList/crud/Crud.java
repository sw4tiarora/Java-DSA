package crud;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList{
    Node head;

    void insert(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    void update(int oldVal, int newVal){
        Node temp = head;
        while(temp != null){
            if(temp.data == oldVal){
                temp.data = newVal;
                return;
            }
            temp = temp.next;
        }
    }

    void delete(int value){
        if(head == null) return;

        if(head.data == value){
            head = head.next;
            return;
        }
        Node temp = head;

        while(temp.next != null && temp.next.data != value){
            temp = temp.next;
        }
        if(temp.next != null){
            temp.next = temp.next.next;
        }
    }
}

public class Crud {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);

        list.display();

        list.update(20,25);
        list.display();

        list.delete(25);
        list.display();
    }
}