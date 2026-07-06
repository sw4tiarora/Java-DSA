package removeDuplicatesSortedDLL;

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
    public Node removeDupes(Node head){
        Node curr = head;
        while(curr != null && curr.next != null){
            if(curr.data == curr.next.data){
                curr.next = curr.next.next;
                if(curr.next !=null){
                    curr.next.prev = curr;
                }
            }
            else{
                curr = curr.next;
            }
        }
        return head;
    }
}

public class RemoveDuplicatesSortedDLL {

    public static void printDLL(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // 1 <-> 1 <-> 2 <-> 2 <-> 2 <-> 3 <-> 4 <-> 4
        Node head = new Node(1);
        Node second = new Node(1);
        Node third = new Node(2);
        Node fourth = new Node(2);
        Node fifth = new Node(2);
        Node sixth = new Node(3);
        Node seventh = new Node(4);
        Node eighth = new Node(4);

        head.next = second;
        second.prev = head;

        second.next = third;
        third.prev = second;

        third.next = fourth;
        fourth.prev = third;

        fourth.next = fifth;
        fifth.prev = fourth;

        fifth.next = sixth;
        sixth.prev = fifth;

        sixth.next = seventh;
        seventh.prev = sixth;

        seventh.next = eighth;
        eighth.prev = seventh;

        System.out.print("Original DLL: ");
        printDLL(head);

        LinkedList list = new LinkedList();
        head = list.removeDupes(head);

        System.out.print("After removing duplicates: ");
        printDLL(head);
    }
}
