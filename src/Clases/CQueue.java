package Clases;

public class CQueue {
    int SIZE; // Size of Circular Queue
    int front, rear;
    int items[];

    // Constructures
    public CQueue() {
        this.SIZE = 5;
        items = new int[SIZE];
        resetQueue();
    }
    // Constructur con parametro
    public CQueue(int size) {
        this.SIZE = size;
        items = new int[SIZE];
        resetQueue();
    }

    private void resetQueue(){
        this.front = -1;
        this.rear = -1;
    }

    // Check if the queue is full
    private boolean isFull() {
        if (front == 0 && rear == SIZE - 1) {
            return true;
        }
        if (front == rear + 1) {
            return true;
        }
        return false;
    }

    // Check if the queue is empty
    private boolean isEmpty() {
        if (front == -1)
            return true;
        else
            return false;
    }

    // Adding an element
    public void enQueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (front == -1)
                front = 0;
            rear = (rear + 1) % SIZE;
            items[rear] = element;
            System.out.println("Inserted " + element);
        }
    }

    // Removing an element
    public int deQueue() {
        int element;
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return (-1);
        } else {
            element = items[front];
            if (front == rear) {
                resetQueue();
            } /* Q has only one element, so we reset the queue after deleting it. */
            else {
                front = (front + 1) % SIZE;
            }
            return (element);
        }
    }

    // Imprimir la cola circular, con todos sus elementos.
    public void display() {
        /* Function to display status of Circular Queue */
        int i;
        if (isEmpty()) {
        System.out.println("Empty Queue");
        } else {
        System.out.println("Front -> " + front);
        System.out.println("Items -> ");
        for (i = front; i != rear; i = (i + 1) % SIZE)
            System.out.print(items[i] + " ");
        System.out.println(items[i]);
        System.out.println("Rear -> " + rear);
        }
    }

}
