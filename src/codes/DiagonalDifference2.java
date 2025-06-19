package codes;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class diagonalDifference2 {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here    
    int previous = 0; 
    int current = 0; 
    
    for(int i = 0; i < arr.size(); i++){
        current = arr.get(i).get(i); 
        if(previous == 0){
            previous = current; 
        } else {
            previous = previous + current; 
        }
    }
    
    int toAdd1 = previous; 
    previous = 0; 
    
    for(int i = 0; i < arr.size(); i++){
        current = arr.get(i).get(arr.size()-i-1);
        if(previous == 0){
            previous = current; 
        } else {
            previous = previous + current; 
        }
    }
    
    int toAdd2 = previous; 
    int sum = toAdd1 - toAdd2; 
    
    if(sum < 0){
        sum = 0 - sum; 
    }

    return sum; 

    }

}

public class DiagonalDifference2 {
    public static void main(String[] args) throws IOException {
        // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        // int n = Integer.parseInt(bufferedReader.readLine().trim());

        //List<List<Integer>> arr = Arrays.asList((11, 2, 4), (4, 5, 6), (10, 8, -12)); 

        //convert Array to List using for loop
        int[] a = {1, 2, 3}; 
        List<Integer> ar = new LinkedList<>(); 
        //normal for loop
        for(int i = 0; i < a.length; i++){
            ar.add(a[i]);
        }
        System.out.println(ar);

        List<Integer> br = new LinkedList<>(); 
        //enhanced for loop
        for(int b : a){
            br.add(b);
        }
        System.out.println(br);

        //Or can use Arrays.asList(11, 2, 4), but still need to list out the items like when creating the array
        List<Integer> arr = Arrays.asList(11, 2, 4); 
        System.out.println(arr);

        // IntStream.range(0, n).forEach(i -> {
        //     try {
        //         arr.add(
        //             Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
        //                 .map(Integer::parseInt)
        //                 .collect(toList())
        //         );
        //     } catch (IOException ex) {
        //         throw new RuntimeException(ex);
        //     }
        // });

        // int result = Result.diagonalDifference(arr);

        // bufferedWriter.write(String.valueOf(result));
        // bufferedWriter.newLine();

        // bufferedReader.close();
        // bufferedWriter.close();
    }
}

