public class App3 {
    public static void main(String[] args){
        //Multidimensional arrays
        //Initialize example
        int[][] a = {
            {1, 2, 3}, 
            {4, 5, 6, 9}, 
            {7}, 
      };

       // create a 2d array
       // Showing information
       int[][] b = {
            {1, 2, 3}, 
            {4, 5, 6, 9}, 
            {7}, 
        };
    
        // calculate the length of each row
        System.out.println("Length of row 1: " + b[0].length);
        System.out.println("Length of row 2: " + b[1].length);
        System.out.println("Length of row 3: " + b[2].length);
        
        //Loop on a for 
        int[][] c = {
            {1, -2, 3}, 
            {-4, -5, 6, 9}, 
            {7}, 
        };
      
        for (int i = 0; i < c.length; ++i) {
            for(int j = 0; j < c[i].length; ++j) {
                System.out.println(a[i][j]);
            }
        }

        // For each loop

        // create a 2d array
        int[][] d = {
            {1, -2, 3}, 
            {-4, -5, 6, 9}, 
            {7}, 
        };
      
        // first for...each loop access the individual array
        // inside the 2d array
        for (int[] innerArray: d) {
            // second for...each loop access each element inside the row
            for(int data: innerArray) {
                System.out.println(data);
            }
        }


        // 3D array
        // test is a 3d array
        int[][][] test = {
            {
            {1, -2, 3}, 
            {2, 3, 4}
            }, 
            { 
            {-4, -5, 6, 9}, 
            {1}, 
            {2, 3}
            } 
        };

         // for..each loop to iterate through elements of 3d array
         for (int[][] array2D: test) {
            for (int[] array1D: array2D) {
                for(int item: array1D) {
                    System.out.println(item);
                }
            }
        }
    
    }
}
