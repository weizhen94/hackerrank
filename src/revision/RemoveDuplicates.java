package revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicates {

    public static void main(String args[]){

        String[] stringArray = {"apple", "banana", "apple", "orange", "banana", "grape"};
        List<String> stringList = Arrays.asList(stringArray); 
        System.out.println("answer is: " + removeDuplicates(stringList));

    }
    
    public static List<String> removeDuplicates(List<String> list){

        System.out.println("list is: " + list); 
        LinkedHashSet<String> stringSet = new LinkedHashSet<>(list); 
        System.out.println("stringSet is: " + stringSet); 
        List<String> answerList = new ArrayList<>(stringSet); 

        return answerList; 
    }
}
