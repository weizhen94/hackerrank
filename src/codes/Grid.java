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
        System.out.println(grid); 
        grid.size(); 
        String length = grid.get(0); 
        length.length(); 
        if(grid.size() == length.length()){
            return gridChallengeMechanism(grid); 
        } else {
            int total = grid.size();
            int count = 0; 
            List<String> answer = new LinkedList<>(); 
            while(total > 0){
                System.out.println("total: " + total);
                System.out.println("count: " + count);
                String length2 = grid.get(count); 
                int part = length2.length(); 

            List<String> newGrid = new LinkedList<>(); 
            for(int i = 0; i < length2.length(); i++){
                newGrid.add(grid.get(i)); 
            }

            answer.add(gridChallengeMechanism(newGrid));
            System.out.println(answer); 

            total = total - part;
            count = total - 1; 
            }

            if(answer.size() > 0){
                for(String giveAnswer : answer){
                return giveAnswer; 
                } 
            } else {
                return ""; 
            }
            return ""; 
        }

    }

    public static String gridChallengeMechanism(List<String> grid){

        // Write your code here
    //LinkedList<String> eachLine = new LinkedList<>(); 
    String line = ""; 
    LinkedList<String> sortedGrid = new LinkedList<>(); 
    LinkedList<String> firstLetter = new LinkedList<>(); 
    //LinkedList<String> sortedFirstLetter = new LinkedList<>(); 
    
    for(int i = 0; i < grid.size(); i++){
        line = grid.get(i); 
        LinkedList<String> eachLine = new LinkedList<>();
        for(int j = 0; j < grid.size(); j++){
            if(j < grid.size()-1){
                eachLine.add(line.substring(j, j + 1)); 
            } else {
                eachLine.add(line.substring(grid.size()-1)); 
            }
        }
        eachLine.sort(null); 
        //System.out.println(eachLine);
        String sortedLine = ""; 
        for(int k = 0; k < eachLine.size(); k++){
            sortedLine = sortedLine + eachLine.get(k); 
            if(k == 0){
                firstLetter.add(eachLine.get(k)); 
            }
        }
        sortedGrid.add(sortedLine); 
    }
    
    //System.out.println(firstLetter);
    
    String oFL = ""; 
    
    for(String fL : firstLetter){
        fL = fL + firstLetter; 
        oFL = fL; 
    }
    
    System.out.println(oFL);
    
    firstLetter.sort(null); 
    
    String oSFL = ""; 
    
    for(String sFL : firstLetter){
        //sortedFirstLetter.add(sFL);
        sFL = sFL + firstLetter;
        oSFL = sFL; 
    }
    
    System.out.println(oSFL);
    
    if(oFL.equals(oSFL)){
        return "YES"; 
    } else {
        return "NO";
    }

    }

}

public class Grid {
    public static void main(String[] args) throws IOException {
        // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        // int t = Integer.parseInt(bufferedReader.readLine().trim());

        // IntStream.range(0, t).forEach(tItr -> {
        //     try {
        //         int n = Integer.parseInt(bufferedReader.readLine().trim());

        //         List<String> grid = IntStream.range(0, n).mapToObj(i -> {
        //             try {
        //                 return bufferedReader.readLine();
        //             } catch (IOException ex) {
        //                 throw new RuntimeException(ex);
        //             }
        //         })
        //             .collect(toList());

                List<String> grid = new LinkedList<String>();
                // grid.add("kc"); 
                // grid.add("iu"); 
                grid.add("uxf"); 
                grid.add("vof"); 
                grid.add("hmp"); 

                String result = grid1.gridChallenge(grid);

                System.out.println(result); 

        //         bufferedWriter.write(result);
        //         bufferedWriter.newLine();
        //     } catch (IOException ex) {
        //         throw new RuntimeException(ex);
        //     }
        // });

        // bufferedReader.close();
        // bufferedWriter.close();
    }
}

