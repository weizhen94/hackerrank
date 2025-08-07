package blind75;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List; 

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        List<String> stringList = new LinkedList<>(); 
        List<List<String>> answer = new LinkedList<>();

        for(String s : strs){
            char[] charArray = s.toCharArray(); 
            Arrays.sort(charArray);
            //System.out.println("charArray is: " + Arrays.toString(charArray)); 
            stringList.add(new String(charArray)); 
            //System.out.println("stringList is: " + stringList); 
        }

        for(int i = 0; i < stringList.size(); i++){
            List<Integer> index = new LinkedList<>(); 
            List<String> answerList = new LinkedList<>();
            for(int j = 0; j < stringList.size(); j++){
               if(i != j && stringList.get(i).equals(stringList.get(j))){
                System.out.println("i is: " + i + " and j is: " + j);
                index.add(j); 
                if(!index.contains(i)){
                    index.add(i); 
                }
               }

               if(i != j && !stringList.get(i).equals(stringList.get(j))){
                if(!index.contains(i)){
                    index.add(i); 
                }
               }

               if(stringList.size() == 1){
                if(!index.contains(i)){
                    index.add(i); 
                }
               }
            }
            System.out.println("index is: " + index);
            index.sort(null); 
            for(int k = 0; k < index.size(); k++){
                answerList.add(strs[index.get(k)]);
            }
            answer.add(answerList); 
            System.out.println("answer is: " + answer);

            for(int l = 0; l < answer.size(); l++){
            for(int m = 0; m < answer.size(); m++){
                if(l != m && answer.get(l).equals(answer.get(m))){
                    answer.remove(m); 
                    System.out.println("answer inside loop is: " + answer);
                }
            }
        }
        }

        // for(int i = 0; i < answer.size(); i++){
        //     for(int j = 0; j < answer.size(); j++){
        //         if(i != j && answer.get(i).equals(answer.get(j))){
        //             answer.remove(j); 
        //             System.out.println("answer inside loop is: " + answer);
        //         }
        //     }
        // }
        return answer; 
    }
    
}

