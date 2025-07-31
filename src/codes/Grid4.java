package codes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Grid4 {

    public static String gridChallengeMechanism(List<String> grid) {
    List<String> sortedGrid = new ArrayList<>();
    
    // Step 1: Sort each row
    for (String row : grid) {
        char[] chars = row.toCharArray();
        Arrays.sort(chars);
        sortedGrid.add(new String(chars));
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

