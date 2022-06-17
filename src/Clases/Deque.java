package Clases;

public class Deque {
    // Atributos
    // Maximo que indica el tamano del arreglo
    static final int MAX = 100;
    // Arreglo
    int arr[];
    // Puntero al front
    int front;

    // Puntero al rear
    int rear;

    // Variable de size
    int size;
  
    // Constructor
    // Parametro de size
    public Deque(int size) {
        // Crear el arreglo
      arr = new int[MAX];
      // Asignar el puntero a -1
      front = -1;
      // Asignar el puntero a 0
      rear = 0;

      // Asignar un tamano
      this.size = size;
    }
  
    // Si esta lleno
    private boolean isFull() {
        // Primer parentesis
        // Si el front es igual a 0 y el size es igual al tamano -1, es verdadero

        // Segundo parentesis
        // Si el front es igual a rear + 1, es verdadero.
      return ((front == 0 && rear == size - 1) || (front == rear + 1));
    }
  
    private boolean isEmpty() {
        // Si el front es igual a -1
      return (front == -1);
    }
  

    // Insertar por frente a la lista.
    // Parametro es el elemento a insertar
    public void insertFront(int key) {
        // Si la el deque esta lleno, mensaje de error
      if (isFull()) {
        System.out.println("Overflow");
        return;
      }
      
      // Si la lista esta vacia, se inicia.
      // La lista se inicia pero en funcion de los punteros.
      if (front == -1) {
        inicializarPunteros();
      }
      else if (front == 0)
        front = size - 1;
  
      else
        front--;
  
      arr[front] = key;
    }

    private void inicializarPunteros(){
        this.front = 0;
        this.rear = 0;
    }

    private void resetArreglo(){
        front = -1;
        rear = -1;
    }
    
    // Insertar atras
    // Parametro elemento a insertar
    public void insertRear(int key) {
        // Si esta lleno mensaje de error
      if (isFull()) {
        System.out.println(" Overflow ");
        return;
      }
  
      // Si el front es -1, iniciamos punteros.
      if (front == -1) {
        inicializarPunteros();
      }
  
      else if (rear == size - 1)
        rear = 0;
  
      else
        rear = rear + 1;
  
      arr[rear] = key;
    }
    
    // Delete desde el frente.
    public void deleteFront() {
        // Si esta vacio, y intentamos hacer un delete, mensaje de error.
      if (isEmpty()) {
        System.out.println("Queue Underflow\n");
        return;
      }
  
      // Deque has only one element
      // Si el deque tiene un solo elemento.
      if (front == rear) {
        resetArreglo();
      } else if (front == size - 1)
        front = 0;
  
      else
        front = front + 1;
    }
  
    public void deleteRear() {
        // Validar si esta vacio, si lo esta, mensaje de error.
      if (isEmpty()) {
        System.out.println(" Underflow");
        return;
      }
      // Si el front y el rear son iguales, reseteamos el arreglo.
      if (front == rear) {
        resetArreglo();
      } else if (rear == 0)
        rear = size - 1;
      else
        rear = rear - 1;
    }
  
    public int getFront() {
        // Validar si esta vacio, si lo esta, mensaje de error.
      if (isEmpty()) {
        System.out.println(" Underflow");
        return -1;
      }
      // retorno el valor del index que tenga el front.
      return arr[front];
    }
  
    public int getRear() {
        // SI esta vacio o el rear es menor a 0, mensaje de error.
      if (isEmpty() || rear < 0) {
        System.out.println(" Underflow\n");
        return -1;
      }
      // retorno el valor del index que tenga el rear.
      return arr[rear];
    }

    public void display() {
        /* Function to display elements of Queue */
        int i;
        if (isEmpty()) {
          System.out.println("Empty Queue");
        } else {
          System.out.println("\nFront index-> " + front);
          System.out.println("Items -> ");
          
          for (i = 0; i <= size-1; i++)
            System.out.print(arr[i] + "  ");
    
          System.out.println("\nRear index-> " + rear);
        }
      }
}