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

class grid1 {

    /*
     * Complete the 'gridChallenge' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING_ARRAY grid as parameter.
     */

    public static String gridChallenge(List<String> grid) {
    // Write your code here
    char[] eachLine = new char[grid.size()]; 
    String line = ""; 
    LinkedList<String> sortedGrid = new LinkedList<>(); 
    
    for(int i = 0; i < grid.size(); i++){
        line = grid.get(i); 
        for(int j = 0; j < grid.size(); j++){
            eachLine[j] = line.charAt(j); 
        }
        Arrays.sort(eachLine); 
        System.out.println(Arrays.toString(eachLine));
        String sortedLine = ""; 
        for(int k = 0; k < eachLine.length; k++){
            sortedLine = sortedLine + eachLine[k]; 
        }
        sortedGrid.add(sortedLine); 
    }
    
    System.out.println(sortedGrid);
    
    return ""; 

    }

}

public class Grid {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<String> grid = IntStream.range(0, n).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                    .collect(toList());

                String result = grid1.gridChallenge(grid);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}

