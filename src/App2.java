public class App2 {
    //
    public static void main(String[] args) throws Exception {
        int[] listaDeNumeros = {1, 2, 3, 4, 5, 6};

        //Se impriman nada mas los numeros primos
        for(int i = 2; i <= listaDeNumeros.length-1; i = i + 2){
            if ( (listaDeNumeros[i] % 2) == 0 ){
                System.out.println(listaDeNumeros[i]);
            }
        }

        System.out.println("Hola soy un cambio para git");
        System.out.println("Soy un cambio un cambio pequeno");
    }
}
