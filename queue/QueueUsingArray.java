public class QueueUsingArray {
    int front = 0, rear = -1, size = 5;
    int[] arr = new int[size];
    void enqueue(int x){
        if(rear==size-1){
            System.out.println("Overflow");
            return;
        }
        arr[++rear] = x;
    }
    void dequeue(){
        if(front>rear){
            System.out.println("Underflow");
            return;
        }
        front++;
    }
}
