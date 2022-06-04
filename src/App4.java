import java.util.Arrays;

public class App4 {
    public static void main(String[] args){
        int [] numbers = {1, 2, 3, 4, 5, 6};
        int [] positiveNumbers = numbers;    // copying arrays

        // change value of first array
        numbers[0] = -1;

        for (int number: positiveNumbers) {
            System.out.print(number + ", ");
        }


        int [] source = {1, 2, 3, 4, 5, 6};
        int [] destination = new int[6];

        // iterate and copy elements from source to destination
        for (int i = 0; i < source.length; ++i) {
            destination[i] = source[i];
        }
      
         // converting array to string
        System.out.println(Arrays.toString(destination));
    }
}
