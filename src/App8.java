import java.util.ArrayList;
import java.util.List;

import Clases.PriorityQueue;

public class App8 {
    public static void main(String args[]){
        //List<Integer> arrayList = new ArrayList<Integer>();
        ArrayList<Integer> array = new ArrayList<Integer>();
        //Size n elementos
        int size = array.size();

        PriorityQueue colaPrioridad = new PriorityQueue();
        colaPrioridad.insert(array, 3);
        colaPrioridad.insert(array, 4);
        colaPrioridad.insert(array, 9);
        colaPrioridad.insert(array, 5);
        colaPrioridad.insert(array, 2);

        System.out.println("Max-Heap array: ");
        colaPrioridad.printArray(array, size);

        colaPrioridad.deleteNode(array, 4);
        System.out.println("After deleting an element: ");
        colaPrioridad.printArray(array, size);
    }
}
