import java.util.ArrayList;

public class Queue {
    private int capacity;
    private ArrayList<Integer> queue;
    private int front;
    private int rear;

    Queue(int capacity) {
        this.capacity = capacity;
        queue = new ArrayList<>(this.capacity);
        front = rear = -1;
    }

    Queue() {
        this.capacity = 10;
        queue = new ArrayList<>(this.capacity);
        front = rear = -1;
    }

    void add(int data) throws OverflowException {
        if ((rear + 1) % this.capacity == front)
            throw new OverflowException();
        else if(front == -1)
            front = rear = 0;
        else if (rear == this.capacity - 1 && front != 0)
            rear = 0;
        else
            rear += 1;

        queue.add(rear, data);
    }

    int remove() throws UnderflowException {
        if(front == -1)
            throw new UnderflowException();

        int data = queue.get(front);
        queue.remove(front);

        if (front == rear)
            front = rear = -1;
        else if (front == this.capacity - 1)
            front = 0;
        else
            front++;

        return data;
    }

    int capacity() {
        return this.capacity;
    }

    void display() {
        for (int q:
             queue) {
            System.out.print(q + " ");
            System.out.println();
        }
    }
}

class OverflowException extends Exception {
    @Override
    public String toString() {
        return "The Queue is Full";
    }
}

class UnderflowException extends Exception {
    @Override
    public String toString() {
        return "The Queue is Empty";
    }
}
