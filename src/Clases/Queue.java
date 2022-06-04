package Clases;

public class Queue {
    //Atributos
    // POO
    int SIZE;
    int items[];
    int front, rear;
    // Front = Va a apuntar al primer elemento del queue.
    // Rear = Va a apuntar al ultimo elemento del queue.
    //Asignar valores del mismo tipo en una misma linea de codigo.
    //int front = 1, rear = 1;
  
    // Constructor = palabra new.
    public Queue() {
        SIZE = 5;
        items = new int[SIZE];
        resetValues();
    }

    public Queue(int size) {
        SIZE = size;
        items = new int[SIZE];
        resetValues();
    }
    // Methods
    // Metodos
    // Validar si el queue esta lleno
    private boolean isFull() {
      if (front == 0 && rear == SIZE - 1) {
        return true;
      }
      return false;
    }

    private void resetValues(){
        front = -1;
        rear = -1;
    }
  
    // Validar si el queue esta vacio
    private boolean isEmpty() {
      if (front == -1)
        return true;
      else
        return false;
    }
  
    // Agregar un elemento a la cola.
    public void enQueue(int element) {
      if (isFull()) {
        System.out.println("Queue is full");
      } else {
        if (front == -1)
          front = 0;
        rear++;
        items[rear] = element;
        System.out.println("Inserted " + element);
      }
    }
  
    // Remover un elemento de la cola.
    public int deQueue() {
      int element;
      if (isEmpty()) {
        System.out.println("Queue is empty");
        return (-1);
      } else {
        element = items[front];
        if (front >= rear) {
            resetValues();
        } /* Q has only one element, so we reset the queue after deleting it. */
        else {
          front++;
        }
        System.out.println("Deleted -> " + element);
        return (element);
      }
    }
  
    // Imprimir todos los valores del queue.
    public void display() {
      /* Function to display elements of Queue */
      int i;
      if (isEmpty()) {
        System.out.println("Empty Queue");
      } else {
        System.out.println("\nFront index-> " + front);
        System.out.println("Items -> ");
        for (i = front; i <= rear; i++)
          System.out.print(items[i] + "  ");
  
        System.out.println("\nRear index-> " + rear);
      }
    }
}
