package evenOddLL;

class Node{
    int data;
    Node next;
    Node(int data1, Node next1){
        data = data1;
        next = next1;
    }
    Node(int data1){
        data = data1;
    }
}

class LinkedList{
    public static Node evenOdd(Node head){
        if (head == null || head.next == null) {
            return head;
        }
        Node oddHead = head;
        Node evenHead = head.next;

        Node odd = oddHead;
        Node even = evenHead;

        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }

        odd.next = null;
        even.next = oddHead;
        return evenHead;

    }
}

public class EvenOddLL {
    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        Node newHead = LinkedList.evenOdd(head);

        Node temp = newHead;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
