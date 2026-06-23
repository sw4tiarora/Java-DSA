package startingPointLoop;

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
    public static Node start(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast) {
                slow = head;
                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}

public class StartingPointLoop {
    public static void main(String[] args) {
        Node head = new Node(3);
        head.next = new Node(2);
        head.next.next = new Node(0);
        head.next.next.next = new Node(-4);

        // create cycle
        head.next.next.next.next = head.next;

        Node result = LinkedList.start(head);

        if (result != null)
            System.out.println("Cycle starts at node with value: " + result.data);
        else
            System.out.println("No cycle found.");
    }
}
