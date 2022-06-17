import Clases.Deque;

public class App9 {
    public static void main(String[] args){
        Deque dq = new Deque(8);

        dq.insertRear(12);
        dq.insertRear(14);
        dq.insertRear(20);
        dq.insertRear(25);

        dq.insertFront(1);
        dq.insertFront(2);
        dq.insertFront(3);
        dq.insertFront(4);

        dq.deleteFront();

        dq.display();
       
    
    }
}
