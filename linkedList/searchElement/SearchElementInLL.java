package searchElement;

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
    public boolean search(Node head, int target){
        Node temp = head;
        while(temp != null){
            if(temp.data == target){
               return true;
            }
            temp = temp.next;
        }
        return false;
    }
}

public class SearchElementInLL {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        int target = 20;
        LinkedList list = new LinkedList();
        System.out.println("The element " + target + " is present: " + list.search(head, target));
    }
}