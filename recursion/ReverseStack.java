import java.util.Stack;

public class ReverseStack {
    public void insert(Stack<Integer> stack, int temp){
        if(stack.isEmpty()){
            stack.push(temp);
            return;
        }
        int topVal = stack.pop();
        insert(stack, temp);
        stack.push(topVal);
    }

    public void reverse(Stack<Integer> stack){
        if(!stack.isEmpty()){
            int temp = stack.pop();
            reverse(stack);
            insert(stack, temp);
        }
    }

    public static void main(String[] args) {
        // Create a sample stack
        Stack<Integer> st = new Stack<>();
        st.push(4);
        st.push(1);
        st.push(3);
        st.push(2);

        // Create object of ReverseStack
        ReverseStack sol = new ReverseStack();

        // Reverse the stack
        sol.reverse(st);

        // Print the reversed stack
        System.out.print("Reversed Stack: ");
        while (!st.isEmpty()) {
            System.out.print(st.pop() + " ");
        }
        System.out.println();
    }
}
