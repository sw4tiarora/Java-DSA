package flatteningLL;

class Node{
    int data;
    Node next;
    Node child;
    Node(int data1){
        data = data1;
        next = null;
        child = null;
    }
}

class LinkedList{
    private Node merge(Node head1, Node head2){
        Node dummy = new Node(-1);
        Node temp = dummy;

        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.child = head1;
                head1 = head1.child;
            }
            else{
                temp.child = head2;
                head2 = head2.child;
            }
            temp = temp.child;
            temp.next = null;
        }
        if(head1 != null){
            temp.child = head1;
        } else {
            temp.child = head2;
        }
        return dummy.child;
    }

    public Node flatten(Node head){
        if(head == null || head.next == null){
            return head;
        }

        Node mergedHead = flatten(head.next);

        return merge(head, mergedHead);
    }
}

public class FlatteningLL {
    static void print(Node head)
    {
        while(head != null)
        {
            System.out.print(head.data + " ");
            head = head.child;
        }
    }

    public static void main(String[] args)
    {
        Node head = new Node(5);
        head.child = new Node(7);
        head.child.child = new Node(8);
        head.child.child.child = new Node(30);

        head.next = new Node(10);
        head.next.child = new Node(20);

        head.next.next = new Node(19);
        head.next.next.child = new Node(22);
        head.next.next.child.child = new Node(50);

        head.next.next.next = new Node(28);
        head.next.next.next.child = new Node(35);
        head.next.next.next.child.child = new Node(40);
        head.next.next.next.child.child.child = new Node(45);

        LinkedList obj = new LinkedList();

        Node ans = obj.flatten(head);

        print(ans);
    }
}
