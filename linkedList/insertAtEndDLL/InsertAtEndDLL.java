package insertAtEndDLL;

class Node{
    int data;
    Node next;
    Node prev;
    public Node(int data1, Node next1, Node prev1){
        data = data1;
        next = next1;
        prev = prev1;
    }
    public Node(int data1){
        data = data1;
        next = null;
        prev = null;
    }
}

class LinkedList{
    public static Node insert(Node head, int ele){
        Node newNode = new Node(ele);
        if(head == null){
            return newNode;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
        return head;
    }
    public static void printDLL(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class InsertAtEndDLL {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node second = new Node(20, null, head);
        head.next = second;
        Node third = new Node(30, null, second);
        second.next = third;
        System.out.println("Before insertion:");
        LinkedList.printDLL(head);
        head = LinkedList.insert(head, 40);
        System.out.println("After insertion:");
        LinkedList.printDLL(head);
    }
}
