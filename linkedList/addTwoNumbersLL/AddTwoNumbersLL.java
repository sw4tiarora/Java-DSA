package addTwoNumbersLL;

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
    public Node addTwoNumbers(Node l1, Node l2){
        Node dummy = new Node(0);
        Node tail = dummy;
        int carry = 0;
        while(l1 != null || l2 != null || carry != 0){
            int sum = carry;
            if(l1 != null){
                sum += l1.data;
                l1 = l1.next;
            }
            if(l2 != null){
                sum += l2.data;
                l2 = l2.next;
            }
            Node newNode = new Node(sum % 10);
            tail.next = newNode;
            tail = tail.next;

            carry = sum / 10;
        }
        return dummy.next;
    }
    public void printLL(Node head){
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
}

public class AddTwoNumbersLL {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        Node l1 = new Node(2);
        l1.next = new Node(4);
        l1.next.next = new Node(3);

        Node l2 = new Node(5);
        l2.next = new Node(6);
        l2.next.next = new Node(4);

        Node ans = list.addTwoNumbers(l1, l2);

        list.printLL(ans);
    }
}
