import java.util.*;

public class StackUsingArrayII {
    private int[] stackArray;
    private int capacity;
    private int topIndex;

    // constructor
    public StackUsingArrayII(int size){
        capacity = size;
        stackArray = new int[capacity];
        topIndex = -1;
    }

    public StackUsingArrayII(){
        this(1000);
    }

    // push
    public void push(int x){
        if(topIndex >= capacity - 1){
            System.out.println("Stack Overflow");
            return;
        }
        stackArray[++topIndex] = x;
    }

    // pop
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return -1;
        }
        return stackArray[topIndex--];
    }

    // return top ele - peek
    public int top(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return stackArray[topIndex];
    }

    public boolean isEmpty(){
        return topIndex == -1;
    }

    public static void main(String[] args) {
        StackUsingArrayII stack = new StackUsingArrayII();

        List<String> commands = Arrays.asList("ArrayStack", "push", "push", "top", "pop", "isEmpty");

        List<List<Integer>> inputs = Arrays.asList(Arrays.asList(), Arrays.asList(5), Arrays.asList(10), Arrays.asList(), Arrays.asList(), Arrays.asList());

        for (int i = 0; i < commands.size(); ++i) {
            switch (commands.get(i)) {
                case "push":
                    stack.push(inputs.get(i).get(0));
                    System.out.print("null ");
                    break;
                case "pop":
                    System.out.print(stack.pop() + " ");
                    break;
                case "top":
                    System.out.print(stack.top() + " ");
                    break;
                case "isEmpty":
                    System.out.print((stack.isEmpty() ? "true" : "false") + " ");
                    break;
                case "ArrayStack":
                    System.out.print("null ");
                    break;
            }
        }
    }
}
