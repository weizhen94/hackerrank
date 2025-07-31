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

class Grid_3 {

    public static String gridChallenge(List<String> grid) {
     String line = ""; 
    LinkedList<String> sortedGrid = new LinkedList<>(); 
    LinkedList<String> firstLetter = new LinkedList<>(); 
    
    for(int i = 0; i < grid.size(); i++){
        line = grid.get(i); 
        LinkedList<String> eachLine = new LinkedList<>();
        for(int j = 0; j < line.length(); j++){
            if(j < grid.size()-1){
                eachLine.add(line.substring(j, j + 1)); 
            } else {
                eachLine.add(line.substring(grid.size()-1)); 
            }
        }
        eachLine.sort(null); 
        
        String sortedLine = ""; 
        for(int k = 0; k < eachLine.size(); k++){
            sortedLine = sortedLine + eachLine.get(k); 
            if(k == 0){
                firstLetter.add(eachLine.get(k)); 
            }
        }
        sortedGrid.add(sortedLine); 
    }
    
    String oFL = ""; 

    for(int i = 0; i < firstLetter.size(); i++){
        oFL = oFL + firstLetter.get(i); 
    }
    
    firstLetter.sort(null); 
    
    String oSFL = ""; 
    
    for(int i = 0; i < firstLetter.size(); i++){
        oSFL = oSFL + firstLetter.get(i); 
        if(i < grid.size()-1 && firstLetter.get(i).equals(firstLetter.get(i+1))){
            oSFL = oSFL + "NO"; 
        }
    }
    
    if(oFL.equals(oSFL)){
        return "YES"; 
    } else {
        return "NO";
    }

    }

}

public class Grid3 {
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

                String result = Grid_3.gridChallenge(grid);

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

