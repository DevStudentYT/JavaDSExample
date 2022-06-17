package Clases;

import java.util.ArrayList;

// Ventajas del uso de ArrayList o List

// Podemos agregar cuantos elementos querramos
// 

public class PriorityQueue {
    // Function to heapify the tree
    public void heapify(ArrayList<Integer> hT, int i) {
        int size = hT.size();
        // Find the largest among root, left child and right child
        int largest = i;// padre de la parte del nodo del arbol
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < size && hT.get(l) > hT.get(largest))
            largest = l;
        if (r < size && hT.get(r) > hT.get(largest))
            largest = r;
    
        // Swap and continue heapifying if root is not largest
        if (largest != i) {
            int temp = hT.get(largest);
            hT.set(largest, hT.get(i));
            hT.set(i, temp);
            
            heapify(hT, largest);
        }
    }
    
    // Function to insert an element into the tree
    // Max-Heap.
    public void insert(ArrayList<Integer> hT, int newNum) {
        int size = hT.size();
        if (size == 0) {
            hT.add(newNum);
        } else {
            hT.add(newNum);
            //Devolviendo el indice del nodo principal en el que estamos
            int valor = size / 2 - 1;
            for (int i = size / 2 - 1; i >= 0; i--) {
                heapify(hT, i);
            }
        }
    }
    
    // Function to delete an element from the tree
    public void deleteNode(ArrayList<Integer> hT, int num) {
        int size = hT.size();
        int i;
        for (i = 0; i < size; i++) {
            if (num == hT.get(i))
                break;
        }
    
        int temp = hT.get(i);
        hT.set(i, hT.get(size - 1));
        hT.set(size - 1, temp);
    
        hT.remove(size - 1);
        // J es el indice 0 para tomar el nodo principal 
        // del array o hablando directamente del arbol.
        for (int j = size / 2 - 1; j >= 0; j--) {
            heapify(hT, j);
        }
    }
    
    // Print the tree
    public void printArray(ArrayList<Integer> array, int size) {
        for (Integer i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
      
}
