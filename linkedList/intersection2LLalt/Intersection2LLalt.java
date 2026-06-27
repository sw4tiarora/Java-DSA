// alternate approach
package intersection2LLalt;

class Node {
    int data;
    Node next;

    Node(int data1, Node next1) {
        data = data1;
        next = next1;
    }

    Node(int data1) {
        data = data1;
        next = null;
    }
}

class LinkedList {

    public Node intersection(Node headA, Node headB) {

        Node d1 = headA;
        Node d2 = headB;

        while (d1 != d2) {

            if (d1 == null) {
                d1 = headB;
            } else {
                d1 = d1.next;
            }

            if (d2 == null) {
                d2 = headA;
            } else {
                d2 = d2.next;
            }
        }

        return d1;
    }
}

public class Intersection2LLalt {

    public static void main(String[] args) {

        // Common part
        Node common = new Node(2);
        common.next = new Node(4);

        // List A: 1 -> 3 -> 1 -> 2 -> 4
        Node headA = new Node(1);
        headA.next = new Node(3);
        headA.next.next = new Node(1);
        headA.next.next.next = common;

        // List B: 3 -> 2 -> 4
        Node headB = new Node(3);
        headB.next = common;

        LinkedList list = new LinkedList();

        Node ans = list.intersection(headA, headB);

        if (ans != null) {
            System.out.println("Intersection at node: " + ans.data);
        } else {
            System.out.println("No Intersection");
        }
    }
}