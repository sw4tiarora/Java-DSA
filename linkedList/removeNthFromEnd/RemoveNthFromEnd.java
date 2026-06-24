package removeNthFromEnd;

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
    public Node remove(Node head, int N){
        if(head == null) return null;
        Node slow = head;
        Node fast = head;

        for (int i = 0; i < N; i++) {
            fast = fast.next;
        }
        if(fast == null){
            return head.next;
        }
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return head;
    }
}

public class RemoveNthFromEnd {
    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        LinkedList ll = new LinkedList();

        head = ll.remove(head, 2);

        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
