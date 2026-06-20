package crudInDLL;

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
    public Node convertToDLL(int[] arr){
        Node head = new Node(arr[0]);
        Node prev = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
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

    public void updateValue(Node head, int oldValue, int newValue){
        Node temp = head;
        while(temp != null){
            if(temp.data == oldValue){
                temp.data = newValue;
                return;
            }
            temp = temp.next;
        }
    }

    public void updateAtPosition(Node head, int pos, int newValue){
        Node temp = head;
        for (int i = 1; temp != null && i < pos; i++) {
            temp = temp.next;
        }
        if(temp != null) {
            temp.data = newValue;
        }
    }

    public Node deleteHead(Node head){
        if(head == null || head.next == null){
            return null;
        }
        Node newHead = head.next;
        newHead.prev = null;
        head.next = null;
        return newHead;
    }
}

public class CrudDLL {
    public static void main(String[] args) {
        int[] arr = {2,5,8,7};
        LinkedList list = new LinkedList();
        Node head = list.convertToDLL(arr);
        list.printDLL(head);
        list.updateValue(head, 5, 50);
        list.printDLL(head);
        head = list.deleteHead(head);
        list.printDLL(head);
    }
}
