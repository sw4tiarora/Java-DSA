package sort012LL;

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
    public Node sortLL(Node head){
        if (head == null || head.next == null) {
            return head;
        }
        Node zeroDummy = new Node(-1);
        Node oneDummy = new Node(-1);
        Node twoDummy = new Node(-1);

        Node zero = zeroDummy;
        Node one = oneDummy;
        Node two = twoDummy;

        Node curr = head;

        while(curr != null){
            Node next = curr.next;   // Save next node
            curr.next = null;
            if(curr.data == 0){
                zero.next = curr;
                zero = zero.next;
            }
            else if(curr.data == 1){
                one.next = curr;
                one = one.next;
            }
            else {
                two.next = curr;
                two = two.next;
            }
            curr = next;
        }
        if(oneDummy.next != null){
            zero.next = oneDummy.next;
        } else{
            zero.next = twoDummy.next;
        }
        one.next = twoDummy.next;
        if(zeroDummy.next != null){
            return zeroDummy.next;
        }
        if(oneDummy.next != null){
            return oneDummy.next;
        }
        return twoDummy.next;
    }
}

public class Sort012LL {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(0);
        head.next.next.next = new Node(1);
        head.next.next.next.next = new Node(0);
        head.next.next.next.next.next = new Node(2);

        LinkedList list = new LinkedList();

        System.out.println("Original List:");
        printList(head);
        head = list.sortLL(head);
        System.out.println("\nSorted List:");
        printList(head);
    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
