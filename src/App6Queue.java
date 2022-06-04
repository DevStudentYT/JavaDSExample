import Clases.Queue;

public class App6Queue {
    public static void main(String[] args){
        Queue cola = new Queue();

        cola.enQueue(1);
        cola.enQueue(2);
        cola.enQueue(3);
        cola.enQueue(4);
        cola.enQueue(5);

        cola.display();

        cola.deQueue();
        cola.deQueue();
        cola.deQueue();
        cola.deQueue();

        cola.display();
    }
}
