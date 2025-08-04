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

class Grid_4 {

    public String gridChallenge(List<String> grid) {
    List<String> sortedGrid = new ArrayList<>();
    
    // Step 1: Sort each row
    for (String row : grid) {
        System.out.println("row is: " + row); 
        char[] chars = row.toCharArray();
        System.out.println(Arrays.toString(chars)); 
        Arrays.sort(chars);
        sortedGrid.add(new String(chars));
        System.out.println("sortedGrid is: " + sortedGrid); 
    }

    int numRows = sortedGrid.size();
    int numCols = sortedGrid.get(0).length();

    // Step 2: Check each column
    for (int col = 0; col < numCols; col++) {
        for (int row = 0; row < numRows - 1; row++) {
            if (sortedGrid.get(row).charAt(col) > sortedGrid.get(row + 1).charAt(col)) {
                return "NO";
            }
        }
    }

    return "YES";
}
    
}

public class Grid4 {

//     private final String word(){
//         return ""; 
//     }

//     public String gridChallenge(List<String> grid) {
//     List<String> sortedGrid = new ArrayList<>();
//     System.out.println("gridNonStatic is: " + grid);
//     // Step 1: Sort each row
//     for (String row : grid) {
//         char[] chars = row.toCharArray();
//         Arrays.sort(chars);
//         sortedGrid.add(new String(chars));
//     }

//     int numRows = sortedGrid.size();
//     int numCols = sortedGrid.get(0).length();

//     // Step 2: Check each column
//     for (int col = 0; col < numCols; col++) {
//         for (int row = 0; row < numRows - 1; row++) {
//             if (sortedGrid.get(row).charAt(col) > sortedGrid.get(row + 1).charAt(col)) {
//                 return "NO";
//             }
//         }
//     }

//     return "YES";
// }
    public static void main(String[] args) throws IOException {

                List<String> grid = new LinkedList<String>();

                //No
                // grid.add("mpxz"); 
                // grid.add("abcd"); 
                // grid.add("wlmf"); 

                //yes
                grid.add("abc"); 
                grid.add("jhk"); 
                grid.add("mpq"); 
                grid.add("rtv"); 

                Grid_4 grid_4 = new Grid_4(); 
                String result = grid_4.gridChallenge(grid);
                // Grid4 grid4 = new Grid4(); 
                // String result = grid4.gridChallenge(grid);

                System.out.println("result is: " + result); 
    }
}

