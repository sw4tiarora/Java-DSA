package addOneRepresentedByLL;

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
    public Node addOne(Node head){
        Node dummy = new Node(0);
        dummy.next = head;

        Node lastNonNine = dummy;
        Node temp = head;

        while(temp != null){
            if(temp.data != 9){
                lastNonNine = temp;
            }
            temp = temp.next;
        }

        lastNonNine.data++;

        temp = lastNonNine.next;
        while(temp != null){
            temp.data = 0;
            temp = temp.next;
        }

        if(dummy.data == 1){
            return dummy;
        }

        return dummy.next;
    }

    public void printLL(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data);

            if (temp.next != null) {
                System.out.print(" -> ");
            }

            temp = temp.next;
        }

        System.out.println();
    }
}

public class AddOneRepresentedByLL {
    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(9);
        head.next.next.next = new Node(9);

        LinkedList ll = new LinkedList();
        head = ll.addOne(head);

        ll.printLL(head);
    }
}
