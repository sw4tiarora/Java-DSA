package sortLL;

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
    public Node sortList(Node head){
        if(head == null || head.next == null) return head;
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node right = slow.next;
        slow.next = null;
        Node left = head;

        left = sortList(left);
        right = sortList(right);

        return merge(left, right);
    }

    public Node merge(Node left, Node right){
        Node dummy = new Node(-1);
        Node temp = dummy;

        while(left != null && right != null){
            if(left.data <= right.data){
                temp.next = left;
                left = left.next;
            } else{
                temp.next = right;
                right = right.next;
            }
            temp = temp.next;
        }
        if(left != null){
            temp.next = left;
        }
        if(right != null){
            temp.next = right;
        }
        return dummy.next;
    }
}

public class SortLL {
    public static void main(String[] args) {
        Node head = new Node(4);
        head.next = new Node(2);
        head.next.next = new Node(1);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(5);
        LinkedList list = new LinkedList();
        System.out.println("Original List:");
        printList(head);
        head = list.sortList(head);
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
