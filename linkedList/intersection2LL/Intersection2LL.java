package intersection2LL;

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
    public Node intersection(Node headA, Node headB){
        int lenA = 0, lenB = 0;
        Node tempA = headA;
        Node tempB = headB;
        while(tempA != null){
            lenA++;
            tempA = tempA.next;
        }
        while(tempB != null){
            lenB++;
            tempB = tempB.next;
        }
        Node currA = headA;
        Node currB = headB;

        if(lenA > lenB){
            int diff = lenA - lenB;
            while(diff-- > 0){
                currA = currA.next;
            }
        } else {
            int diff = lenB - lenA;
            while (diff-- > 0){
                currB = currB.next;
            }
        }

        while (currA != null && currB != null){
            if(currA == currB){
                return currA;
            }
            currA = currA.next;
            currB = currB.next;
        }
        return null;
    }
}

public class Intersection2LL {
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
