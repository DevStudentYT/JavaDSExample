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


        //Examples
        String[] array = new String[100];

        //Declare 
        //dataType[] arrayName;
        String arrayDeclareExample;

        // declare an array
        double[] data;

        // allocate memory
        data = new double[10];

        // Or 
        //double[] data = new double[10];

        //declare and initialize and array
        //int[] age = {12, 4, 5, 2, 5};

        // declare an array
        int[] age = new int[5];

        // initialize array
        age[0] = 12;
        age[1] = 4;
        age[2] = 5;
        age[3] = 10;
        age[4] = 10;

        // Accessing

        System.out.println("First Element: " + age[0]);
        System.out.println("Second Element: " + age[1]);
        System.out.println("Third Element: " + age[2]);
        System.out.println("Fourth Element: " + age[3]);
        System.out.println("Fifth Element: " + age[4]);

         // loop through the array
        // using for loop
        System.out.println("Using for Loop:");
        for(int i = 0; i < age.length; i++) {
            System.out.println(age[i]);
        }

        // loop through the array
        // using for loop
        System.out.println("Using for-each Loop:");
        for(int a : age) {
            System.out.println(a);
        }


        //Example on code

        int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
        int sum = 0;
        Double average;
        
        // access all elements using for each loop
        // add each element in sum
        for (int number: numbers) {
            sum += number;
        }
        
        // get the total number of elements
        int arrayLength = numbers.length;

        // calculate the average
        // convert the average from int to double
        average =  ((double)sum / (double)arrayLength);

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);

    }
}
