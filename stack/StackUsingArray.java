public class StackUsingArray {
    int top = -1;
    int size = 5;
    int[] arr = new int[size];
    void push(int x){
        if(top == size - 1){
            System.out.println("Overflow");
            return;
        }
        arr[++top] = x;
    }
    void pop(){
        if(top==-1){
            System.out.println("Underflow");
            return;
        }
        top--;
    }
    void display(){
        for (int i = top; i>=0 ; i--) {
            System.out.println(arr[i]+" ");
        }
    }

    static void main(String[] args) {
        StackUsingArray s = new StackUsingArray();
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();
        s.pop();
        s.display();
    }
}
