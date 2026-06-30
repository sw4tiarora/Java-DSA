package pairsWithGivenSumDLL;

import java.util.*;

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

    public List<List<Integer>> findPairs(Node head, int target){
        List<List<Integer>> ans = new ArrayList<>();
        if(head == null) return ans;
        Node left = head;
        Node right = head;

        while(right.next != null){
            right = right.next;
        }

        while(left != right && left.prev != right){
            int sum = left.data + right.data;

            if(sum == target){
                ans.add(Arrays.asList(left.data, right.data));
                left = left.next;
                right = right.prev;
            }
            else if(sum < target){
                left = left.next;
            }
            else {
                right = right.prev;
            }
        }
        return ans;
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

public class PairsWithGivenSumDLL {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        int[] arr = {1, 2, 4, 5, 6, 8, 9};
        Node head = list.arrayToDLL(arr);
        list.printDLL(head);

        List<List<Integer>> ans = list.findPairs(head, 7);
        System.out.println(ans);
    }
}
