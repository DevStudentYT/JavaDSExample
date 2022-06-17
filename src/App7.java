import Clases.CQueue;

public class App7 {
    // Cola circulares
    public static void main(String args[]){
        CQueue nuevaCola = new CQueue(4);

        nuevaCola.enQueue(1);
        nuevaCola.enQueue(2);
        nuevaCola.enQueue(3);
        nuevaCola.enQueue(4);

        nuevaCola.display();

        nuevaCola.deQueue();
        nuevaCola.deQueue();
        nuevaCola.deQueue();

        nuevaCola.enQueue(10);
        nuevaCola.enQueue(11);

        nuevaCola.deQueue();

        nuevaCola.display();


    }
}
