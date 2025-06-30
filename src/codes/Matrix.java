package codes;

import java.io.*;
import java.util.*;



class matrix5 {

    /*
     * Complete the 'flippingMatrix' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY matrix as parameter.
     */

    public static int flippingMatrix(List<List<Integer>> matrix) {
    // Write your code here
    //System.out.println(matrix.size());

    double d = 5.0; 
    int integer = (int) d; //to convert from double to int
    System.out.println(integer);
    
    int corner = matrix.size() / 2; 

    List<Integer> sum = new LinkedList<>(); 

    for(int i = 0; i < corner; i++){

        for(int j = 0; j < corner; j++){
            //System.out.println(matrix.get(i).get(j)); 
            
                int[] nums1 = {matrix.get(i).get(j), matrix.get(i).get(matrix.size()-1-j), matrix.get(matrix.size()-1-i).get(j), matrix.get(matrix.size()-1-i).get(matrix.size()-1-j)}; 
                System.out.println(Arrays.toString(nums1));
                int max1 = nums1[0]; 
                System.out.println("first max1:" + max1);
                for(int k = 1; k < nums1.length; k++){
                    //int max1 = nums1[0]; 
                    if(max1 < nums1[k]){
                        max1 = nums1[k]; 
                    }
                }
                sum.add(max1);
                System.out.println("second max1:" + max1);

        }
    }

    System.out.println(sum);

    int total = 0; 

    for(int i = 0; i < sum.size(); i++){
        total = sum.get(i) + total; 
    }

    System.out.println(total);
    
    return total; 

    }

}

public class Matrix {
    public static void main(String[] args) throws IOException {
        // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        // int q = Integer.parseInt(bufferedReader.readLine().trim());

        // IntStream.range(0, q).forEach(qItr -> {
        //     try {
        //         int n = Integer.parseInt(bufferedReader.readLine().trim());

        //         List<List<Integer>> matrix = new ArrayList<>();

        //         IntStream.range(0, 2 * n).forEach(i -> {
        //             try {
        //                 matrix.add(
        //                     Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
        //                         .map(Integer::parseInt)
        //                         .collect(toList())
        //                 );
        //             } catch (IOException ex) {
        //                 throw new RuntimeException(ex);
        //             }
        //         });

        // int[][] matrix = {
        //     {112, 42, 83, 119},
        //     {56, 125, 56, 49},
        //     {15, 78, 101, 43},
        //     {62, 98, 114, 108}
        // };

        List<Integer> matrix1 = Arrays.asList(112, 42, 83, 119);
        List<Integer> matrix2 = Arrays.asList(56, 125, 56, 49);
        List<Integer> matrix3 = Arrays.asList(15, 78, 101, 43); 
        List<Integer> matrix4 = Arrays.asList(62, 98, 114, 108);

        // List<List<Integer>> matrix = new LinkedList<>(); 
        List<List<Integer>> matrix = Arrays.asList(matrix1, matrix2, matrix3, matrix4);
        // matrix.add(matrix1); 
        // matrix.add(matrix2); 
        // matrix.add(matrix3); 
        // matrix.add(matrix4); 

        int result = matrix5.flippingMatrix(matrix);

        System.out.println(result); 

        //         bufferedWriter.write(String.valueOf(result));
        //         bufferedWriter.newLine();
        //     } catch (IOException ex) {
        //         throw new RuntimeException(ex);
        //     }
        // });

        // bufferedReader.close();
        // bufferedWriter.close();
    }
}

