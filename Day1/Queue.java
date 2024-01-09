public class Queue {
    int[] queue;
    int front, rear;

    Queue() {
        queue = new int[100];
        front = rear = -1;
    }

    boolean isEmpty() {
        return front == -1;
    }

    boolean isFull() {
        return rear == queue.length - 1;
    }

    void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue overflow");
            return;
        }
        if (front == -1) {
            front = 0;
        }
        queue[++rear] = data;
    }

    int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue underflow");
            return -1;
        }
        int data = queue[front];
        if (front == rear) {
            front = rear = -1;
        } else {
            front++;
        }
        return data;
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Queue elements:");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue myQueue = new Queue();

    
    
        myQueue.enqueue(10);
        myQueue.enqueue(20);
        System.out.println(myQueue.dequeue());  
    }
}
