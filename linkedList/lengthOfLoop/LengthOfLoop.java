package lengthOfLoop;

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
    public static int length(Node head){
        Node fast = head;
        Node slow = head;
        int cnt = 0;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast){
                cnt = 1;
                fast = fast.next;
                while(fast != slow){
                    cnt++;
                    fast = fast.next;
                }
                return cnt;
            }
        }
        return 0;
    }
}

public class LengthOfLoop {
    public static void main(String[] args) {
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        // create loop
        fifth.next = second;

        int loopLength = LinkedList.length(head);

        if (loopLength > 0) {
            System.out.println("Length of the loop: " + loopLength);
        } else {
            System.out.println("No loop found in the linked list.");
        }
    }
}
