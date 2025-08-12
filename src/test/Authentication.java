package test;

/*
dotc:You are working on an authentication system and there is a set of rules the users have to follow when picking a new password:

1. It has to be at least 16 characters long.
2. The password cannot contain the word "password". This rule is not case-sensitive.
3. The same character cannot be used more than 4 times. This rule is case-sensitive, "a" and "A" are different characters.
4. The password has to contain at least one uppercase and one lowercase letter.
5. The password has to contain at least one of the following special characters "*","#","@".

Write a function that takes in a password and returns a collection of any rule numbers that are not met.

password_1 = "Strongpwd9999#ac"              ==> []
password_2 = "Aess10#"                       ==> [1]
password_3 = "Password@"                     ==> [1,2]
password_4 = "#PassWord011111112222223x"     ==> [2,3]
password_5 = "PASSWORDz#1111111"             ==> [2,3]
password_6 = "aaaapassword$$"                ==> [1,2,3,4,5]
password_7 = "LESS10#"                       ==> [1,4]
password_8 = "SsSSSt#passWord"               ==> [1,2]
password_9 = "SsSSSt#passWordpassword"       ==> [2,3]
password_10 = "aZ*"                          ==> [1]


All test cases:

validate(password_1) ==> []
validate(password_2) ==> [1]
validate(password_3) ==> [1,2]
validate(password_4) ==> [2,3]
validate(password_5) ==> [2,3]
validate(password_6) ==> [1,2,3,4,5]
validate(password_7) ==> [1,4]
validate(password_8) ==> [1,2]
validate(password_9) ==> [2,3]
validate(password_10) ==> [1]


Complexity variables:

N = length of the password
*/

import java.io.*;
import java.util.*;
// import javafx.util.Pair;

public class Authentication {
  public static void main(String[] argv) {
    String password_1 = "Strongpwd9999#ac";
    String password_2 = "Aess10#";
    String password_3 = "Password@";
    String password_4 = "#PassWord011111112222223x";
    String password_5 = "PASSWORDz#1111111";
    String password_6 = "aaaapassword$$";
    String password_7 = "LESS10#";
    String password_8 = "SsSSSt#passWord";
    String password_9 = "SsSSSt#passWordpassword";
    String password_10 = "aZ*";
    Authentication solution = new Authentication(); 
    System.out.println(solution.passwordChecker(password_6));
  }
  
  public List<Integer> passwordChecker(String password){
    System.out.println("password is: " + password); 
    
    List<Integer> answer = new ArrayList<>(); 

    if(password.length()<16){
      System.out.println("length is not 16: " + password.length()); 
      answer.add(1); 
    }
    
    // if(password.replaceAll("[^a-zA-Z]", "").toLowerCase().equals("password")){
    //   System.out.println("password is in string: " + password.replaceAll("[^a-zA-Z]", "").toLowerCase()); 
    //   answer.add(2); 
    // }
    
    if(password.toLowerCase().contains("password")){
      System.out.println("contains password");
      answer.add(2); 
    }
    
    String p = password.toLowerCase();
    String P = password.toUpperCase();
    
    if(p.equals(password) || P.equals(password)){
      System.out.println("password is lowercase?: " + password);
      answer.add(4); 
    }
    
    boolean hasChar = false; 
    
    char[] chars = password.toCharArray(); 
    char s1 = '*';
    char s2 = '#'; 
    char s3 = '@'; 
    for(char c : chars){
      if(c == s1 || c == s2 || c == s3){
        hasChar = true; 
      }
    }
    
    if(!hasChar){
        System.out.println("password has char");
        answer.add(5); 
    }
    
    Map<Character, Integer> map = new HashMap<>(); 
    
    boolean repeat = false; 
    
    for(char c : chars){
      map.put(c, map.getOrDefault(c, 0)+1);
      if(map.get(c) > 4){
        repeat = true; 
      }
    }
    
    if(repeat){
        System.out.println("password has char > 4");
        answer.add(3); 
    }
     
    answer.sort(null); 
    
    return answer;
  }
}
