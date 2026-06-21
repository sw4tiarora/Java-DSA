package reverseDLL;

class Node{
    int data;
    Node next;
    Node prev;
    Node(int data1, Node next1, Node prev1){
        data = data1;
        next = next1;
        prev = prev1;
    }
    Node(int data1){
        data = data1;
        next = null;
        prev = null;
    }
}

class LinkedList{
    public static Node reverse(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node curr = head;
        Node temp = null;

        while(curr != null){
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            curr = curr.prev;
        }

        return temp.prev;
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

public class ReverseDLL {
    public static void main(String[] args) {

        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);

        head.next = second;

        second.prev = head;
        second.next = third;

        third.prev = second;
        third.next = fourth;

        fourth.prev = third;

        System.out.println("Original DLL:");
        LinkedList.printDLL(head);

        head = LinkedList.reverse(head);

        System.out.println("Reversed DLL:");
        LinkedList.printDLL(head);
    }
}
