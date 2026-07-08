package reverseLLinGroupsSizeK;

class Node{
    int data;
    Node next;
    Node(int data1, Node next1){
        data = data1;
        next = next1;
    }
    Node(int data1){
        data = data1;
        next = null;
    }
}

class LinkedList{
    public Node reverse(Node head, int k) {
        if (head == null || head.next == null || k == 1) {
            return head;
        }
        Node curr = head;
        Node newHead = null;
        Node prevGroupTail = null;
        while (curr != null) {
            Node tail = curr;
            for (int i = 1; i < k && tail != null; i++) {
                tail = tail.next;
            }
            if (tail == null) break;
            Node groupNext = tail.next;
            Node prev = groupNext;
            Node next = null;
            Node groupHead = curr;

            while (curr != groupNext) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            if (newHead == null) {
                newHead = prev;
            }
            if (prevGroupTail != null) {
                prevGroupTail.next = prev;
            }
            prevGroupTail = groupHead;

        }
        if (newHead == null) return head;
        return newHead;
    }
}

public class ReverseLLinGroupsSizeK {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        System.out.print("Original List: ");
        printList(head);

        head = list.reverse(head, 3);

        System.out.print("Reversed List: ");
        printList(head);
    }

    static void printList(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
