import Clases.Stack;

public class App5Stack {
    public static void main(String[] args){

        //Introduccion a POO Programacion orientada a objetos.
        // Un tipo de objeto lo estoy agregando a mi contexto desde una plantilla de objeto Stack con la palabra new.
        Stack pila = new Stack();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);
        
        pila.printStack();// Imprimo los valores del stack
        System.out.println("Pila llena.");
        pila.pop();//Remover el ultimo el valor, o remover el objeto que esta de primero en la pila o sobre la pila.
        pila.printStack();
        System.out.println("Se removio un elemento en el top de la pila.");
        pila.pop();//Remover el ultimo el valor, o remover el objeto que esta de primero en la pila o sobre la pila.


        pila.isFull();

    }
}
