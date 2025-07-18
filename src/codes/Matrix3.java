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



class Matrix_3 {

    /*
     * Complete the 'flippingMatrix' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY matrix as parameter.
     */

    public static int flippingMatrix(List<List<Integer>> matrix) {
    // Write your code here
    
    LinkedList<Integer> corners = new LinkedList<>(); 
    int n = matrix.size(); 
    LinkedList<Integer> toSum = new LinkedList<>(); 
    
    for(int i = 0; i < n/2; i++){
        for(int j = 0; j < n/2; j++){
            corners.add(matrix.get(i).get(j)); 
            corners.add(matrix.get(i).get(n-j-1)); 
            corners.add(matrix.get(n-i-1).get(n-j-1)); 
            corners.add(matrix.get(n-i-1).get(j)); 
            corners.sort(null);
            toSum.add(corners.peekLast()); 
            corners.clear();
        }
    }

    int total = 0; 
    
    for(int i = 0; i < toSum.size(); i++){
        total = total + toSum.get(i); 
    }
    
    return total; 
    }

}

public class Matrix3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<List<Integer>> matrix = new ArrayList<>();

                IntStream.range(0, 2 * n).forEach(i -> {
                    try {
                        matrix.add(
                            Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                        );
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                });

                int result = Matrix_3.flippingMatrix(matrix);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}

