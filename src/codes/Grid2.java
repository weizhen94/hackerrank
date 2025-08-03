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

class grid_2 {

    /*
     * Complete the 'gridChallenge' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING_ARRAY grid as parameter.
     */

    public static String gridChallenge(List<String> grid) {

    String line = ""; 
    LinkedList<String> sortedGrid = new LinkedList<>(); 
    LinkedList<String> firstLetter = new LinkedList<>(); 

    
    for(int i = 0; i < grid.size(); i++){
        line = grid.get(i); 
        LinkedList<String> eachLine = new LinkedList<>();
        for(int j = 0; j < line.length(); j++){
            eachLine.add(line.substring(j, j + 1));
            // if(j < line.length()-1){
            //     eachLine.add(line.substring(j, j + 1)); 
            // } else {
            //     eachLine.add(line.substring(line.length()-1)); 
            // }
        }
        eachLine.sort(null); 
        System.out.println("eachline is: " + eachLine);
        String sortedLine = ""; 
        for(int k = 0; k < line.length(); k++){
            sortedLine = sortedLine + eachLine.get(k); 
        }
        sortedGrid.add(sortedLine); 

    }

    System.out.println("sortedGrid is : " + sortedGrid);

    int charAmount = sortedGrid.get(0).length(); 
    int count = 0; 

    List<String> answer = new LinkedList<>(); 

    int i = 0; 
    while(count < sortedGrid.size()){

        // if(i < charAmount - 1){
        //     System.out.println("count is : " + count);
        //     firstLetter.add(sortedGrid.get(count).substring(i, i+1)); 
        //     System.out.println("firstLetter is : " + firstLetter);
        //     count++; 
        //     System.out.println("count++ is : " + count);
        // } else {
        //     firstLetter.add(sortedGrid.get(count).substring(i)); 
        //     count++; 
        // }

        firstLetter.add(sortedGrid.get(count).substring(i, i+1)); 
        count++; 
        
        if(sortedGrid.size() == count){

            System.out.println("count is: " + count); 

            String oFL = ""; 

            for(int j = 0; j < firstLetter.size(); j++){
                 oFL = oFL + firstLetter.get(j); 
            }

            System.out.println("oFL is : " + oFL);

            firstLetter.sort(null); 

            String oSFL = ""; 

            for(int j = 0; j < firstLetter.size(); j++){
            oSFL = oSFL + firstLetter.get(j); 
            }

            firstLetter.clear();

            System.out.println("oSFL is : " + oSFL);

            if(!oFL.equals(oSFL)){
                answer.add("NO"); 
                //count = sortedGrid.size();
            } else {
                answer.add("YES"); 
                count = 0; 
                i++; 
            }

            System.out.println("answer inside is : " + answer);

            if(i == charAmount){
                count = sortedGrid.size();
            }
        }
    }

    System.out.println("answer is : " + answer);

    if(answer.contains("NO")){
        return "NO"; 
    } else {
        return "YES"; 
    }

    }

}

public class Grid2 {
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

                // grid.add("ppp"); 
                // grid.add("ypp"); 
                // grid.add("wyw"); 

                // grid.add("lyivr"); 
                // grid.add("jgfew"); 
                // grid.add("uweor"); 
                // grid.add("qxwyr"); 
                // grid.add("uikjd"); 

                //grid.add("l"); 

                //Yes
                // grid.add("abc"); 
                // grid.add("lmp"); 
                // grid.add("qrt"); 

                //No
                grid.add("mpxz"); 
                grid.add("abcd"); 
                grid.add("wlmf"); 

                //yes
                // grid.add("abc"); 
                // grid.add("hjk"); 
                // grid.add("mpq"); 
                // grid.add("rtv"); 


                String result = grid_2.gridChallenge(grid);

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

