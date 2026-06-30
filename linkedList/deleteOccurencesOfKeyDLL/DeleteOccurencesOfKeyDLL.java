package deleteOccurencesOfKeyDLL;

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
    public Node arrayToDLL(int[] arr){
        if(arr.length == 0) return null;

        Node head = new Node(arr[0]);
        Node prev = head;

        for(int i = 1; i < arr.length; i++){
            Node temp = new Node(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }

        return head;
    }

    public Node deleteKey(Node head, int key){
        Node temp = head;

        while(temp != null){

            if(temp.data == key){
                Node next = temp.next;
                Node prev = temp.prev;
                if(prev != null){
                    prev.next = next;
                } else {
                    head = next;
                }
                if(next != null){
                    next.prev = prev;
                }

                temp.prev = null;
                temp.next = null;

                temp = next;

            } else {
                temp = temp.next;
            }
        }
        return head;
    }

    public void printDLL(Node head){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class DeleteOccurencesOfKeyDLL {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        int[] arr = {1, 2, 3, 2, 4, 2, 5};

        Node head = list.arrayToDLL(arr);

        System.out.println("Original DLL:");
        list.printDLL(head);

        head = list.deleteKey(head, 2);

        System.out.println("After deleting all occurrences of 2:");
        list.printDLL(head);
    }
}
