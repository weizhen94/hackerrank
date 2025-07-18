package codes;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class matrix2_1 {

    /*
     * Complete the 'flippingMatrix' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY matrix as parameter.
     */

    public static int flippingMatrix(List<List<Integer>> matrix) {
    // Write your code here
    //System.out.println(matrix.get(0).get(1)); 
    //System.out.println(matrix.size()); 
    int m = matrix.size()/2; 
    int n = matrix.size(); 
    //System.out.println(n);
    int savedNo = 0; 
    int largestNo = 0; 
    LinkedList<Integer> sequence = new LinkedList<>();
    LinkedList<Integer> toAdd = new LinkedList<>();
    for(int i = 0; i < m; i++){
        for(int j = 0; j < m; j++){
            System.out.println("i is: " + i + ". j is: " + j);
            System.out.println("matrix.get(i).get(j)" + matrix.get(i).get(j));
            sequence.add(matrix.get(i).get(j)); 
            System.out.println("matrix.get(i).get(n-j-1)" + matrix.get(i).get(n-j-1));
            sequence.add(matrix.get(i).get(n-j-1)); 
            System.out.println("matrix.get(n-j-1).get(n-j-1)" + matrix.get(n-i-1).get(n-j-1));
            sequence.add(matrix.get(n-i-1).get(n-j-1)); 
            System.out.println("matrix.get(n-j-1).get(j)" + matrix.get(n-i-1).get(j));
            sequence.add(matrix.get(n-i-1).get(j)); 
            sequence.sort(null);
            System.out.println("sequence is: " + sequence);
            toAdd.add(sequence.peekLast()); 
            sequence.clear(); 
        }
    }

        // int[][] matrix = {
        //     {112, 42, 83, 119},
        //     {56, 125, 56, 49},
        //     {15, 78, 101, 43},
        //     {62, 98, 114, 108}
        // };

    System.out.println("toAdd is: " + toAdd);

    for(int i = 0; i < toAdd.size(); i++){
        savedNo = toAdd.get(i); 
        largestNo = largestNo + savedNo; 
    }
    return largestNo; 
    }

}

public class Matrix2 {
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

        //         int result = Result.flippingMatrix(matrix);

        //         bufferedWriter.write(String.valueOf(result));
        //         bufferedWriter.newLine();
        //     } catch (IOException ex) {
        //         throw new RuntimeException(ex);
        //     }
        // });

        // bufferedReader.close();
        // bufferedWriter.close();
                
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

        int result = matrix2_1.flippingMatrix(matrix);

        System.out.println(result); 
    }
}

