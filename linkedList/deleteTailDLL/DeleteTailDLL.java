package deleteTailDLL;

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
    public static Node delete(Node head){
        if(head == null || head.next == null){
            return null;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.prev.next = null;
        return head;
    }
}

public class DeleteTailDLL {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.prev = head;
        head.next.next = new Node(3);
        head.next.next.prev = head.next;

        LinkedList list = new LinkedList();
        head = list.delete(head);

        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
}
