public class App {
    public static void main(String[] args) throws Exception {
        String[] listaDeAutos = {"Volvo", "BMW", "Ford", "Mazda", "Toyota", "Nissan"};

        System.out.println("Lista de inicio a fin");
        for(int i=0; i <=  listaDeAutos.length-1; i++){
            System.out.println("Valor de i = " + i);
            System.out.println(listaDeAutos[i]);
        }

        System.out.println("Lista de fin a inicio");
        for(int i= listaDeAutos.length-1; i >= 0 ; i--){
            System.out.println("Valor de i = " + i);
            System.out.println(listaDeAutos[i]);
        }

    }
}