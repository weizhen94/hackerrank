package revision;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Casting {

    public static void main(String[] args){

    // double d = 5.0; 
    // float integer = (float) d; //to convert from double to int
    // System.out.println(integer);

    // float f = 5.0f; 
    // long intege = (long) f; //to convert from float to int
    // System.out.println(intege);

    List<Integer> list = Arrays.asList(1, 2, 3, 4); 

    int[] intArray = new int[list.size()]; 

    for(int i = 0; i < list.size(); i++){
        intArray[i] = list.get(i); 
    }

    System.out.println("Array" + Arrays.toString(intArray));

    Set<Integer> set = new HashSet<>(); 

    for(int i = 0; i < list.size(); i++){
        set.add(list.get(i)); 
    }

    System.out.println("Set" + set);
    

     int[][] matrix = {
            {112, 42, 83, 119},
            {56, 125, 56, 49},
            {15, 78, 101, 43},
            {62, 98, 114, 108}
        };

        int length = matrix.length; 

        System.out.println("length is: " + length);

        List<Integer> matrix1 = new LinkedList<>(); 

        for(int i = 0; i < matrix.length; i++){
            matrix1.add(matrix[0][i]); 
        }

        System.out.println(matrix1);

        List<Integer> matrix2 = new LinkedList<>(); 

        for(int i = 0; i < matrix.length; i++){
            matrix2.add(matrix[1][i]); 
        }

        System.out.println(matrix2);

        List<Integer> matrix3 = new LinkedList<>(); 

        for(int i = 0; i < matrix.length; i++){
            matrix3.add(matrix[2][i]); 
        }

        System.out.println(matrix3);

        List<Integer> matrix4 = new LinkedList<>(); 

        for(int i = 0; i < matrix.length; i++){
            matrix4.add(matrix[3][i]); 
        }

        System.out.println(matrix4);

        List<List<Integer>> finalMatrix = new LinkedList<>(); 
        finalMatrix.add(matrix1); 
        finalMatrix.add(matrix2); 
        finalMatrix.add(matrix3); 
        finalMatrix.add(matrix4); 

        System.out.println(finalMatrix);

        //List<List<Integer>> matrix5 = Arrays.asList(matrix1, matrix2, matrix3, matrix4);

        //while loop
        int i = 0; 
        boolean four = true; 
        while(four){
            i++; 
            System.out.println("i is:" + i);
            if(i == 4){
                four = false; 
            }

        }

        // putting strings together
        String t = "try"; 
        String c = "catch"; 

        String f = t + " " + c; 
        System.out.println(f);

        if(!c.equals("try")){
            System.out.println(c);
        }

        Set<String> set2 = new LinkedHashSet<>();  
        
        

    }
}
