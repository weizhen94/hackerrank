package blind75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class LongestSubstringWithoutRepeat {

    public int lengthOfLongestSubstring(String s) {

        // char[] c = s.toCharArray();
        // List<Character> list = new ArrayList<>(); 
        // for(char chars : c){
        //     list.add(chars);
        // }
        // Set<Character> filter = new HashSet<>(list); 

        // list.clear();
        // Iterator<Character> iterator = filter.iterator();
        // while(iterator.hasNext()){
        //     list.add(iterator.next());
        // }

        // String sub = String.valueOf(list.get(0));

        // int i = 0; 
        // while(i < list.size()-1 && s.contains(sub)){
        //     i++;
        //     sub = sub + String.valueOf(list.get(i));
        // }

        // return i+1; 

        int ans = 0; 
        int finalAns = 0; 

        for(int i = s.length(); i >= 0; i--){
            for(int j = 0; i + j <= s.length(); j++){
                System.out.println("i is: " + i + ". j is: " + j);
                String sub = s.substring(j,i+j);
                System.out.println("sub is: " + sub);
                char[] c = sub.toCharArray();
                List<Character> list = new LinkedList<>(); 
                for(char chars : c){
                    list.add(chars);
                }
                Set<Character> filter = new LinkedHashSet<>(list); 

                list.clear();
                Iterator<Character> iterator = filter.iterator();
                while(iterator.hasNext()){
                    list.add(iterator.next());
                }

                char[] d = new char[list.size()];
                for(int k = 0; k < list.size(); k++){
                    d[k] = list.get(k);
                    ans++;
                System.out.println("ans is: " + ans);
                }

                String compare = new String(d);
                System.out.println("compare is: " + compare);

                if(sub.equals(compare)){
                    System.out.println("inside sub.equals(compare)");
                    if(ans>finalAns){
                        finalAns = ans;   
                    }
                }

                ans = 0; 
            }
        }

        return finalAns; 
        
    }

    public static void main(String[] args){

        LongestSubstringWithoutRepeat sLong = new LongestSubstringWithoutRepeat();
        String s = "pwwkew";
        System.out.println(sLong.lengthOfLongestSubstring(s));

    }
    
}
