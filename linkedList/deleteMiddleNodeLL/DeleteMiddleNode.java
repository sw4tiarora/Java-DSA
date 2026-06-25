package deleteMiddleNodeLL;

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
    public static Node delete(Node head){
        if (head == null || head.next == null) {
            return null;
        }
        Node slow = head;
        Node fast = head.next.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;

        return head;
    }
    public static void printLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class DeleteMiddleNode {
    public static void main(String[] args) {
        // Creating linked list 1->2->3->4->5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // Printing original list
        System.out.print("Original Linked List: ");
        LinkedList.printLL(head);

        head = LinkedList.delete(head);

        System.out.print("Updated Linked List: ");
        LinkedList.printLL(head);
    }
}
