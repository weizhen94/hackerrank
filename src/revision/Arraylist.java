package revision;

import java.util.ArrayList;

public class Arraylist {

    public static void main(String args[]){

        ArrayList<String> fruits = new ArrayList<>();

        // add items to arraylist, add by index, cannot addFirst, addLast
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println(fruits); // [Apple, Banana, Cherry]

    }
    
}
