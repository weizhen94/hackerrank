package revision;

import java.util.Arrays;

public class Conversion {

    public static void main(String args[]){

        String numberString = "3";
        System.out.println("This is string: " + numberString);  
        int numberInt = Integer.parseInt(numberString); // this is the way to convert string to int
        System.out.println("This is int: " + numberInt); 

        // this is the way to convert int, double, long, float, char, boolean to string 
        int number = 4; 
        String numberInString = String.valueOf(number); 
        System.out.println("This is numberInString: " + numberInString); 

        double doubleValue = 3.1415926;
        String doubleInString = String.valueOf(doubleValue);
        System.out.println("This is doubleInString: " + doubleInString); 

        float floatValue = 3.1415926f;
        String floatInString = String.valueOf(floatValue);
        System.out.println("This is floatInString: " + floatInString); 

        long longValue = 10000000000L;
        String longInString = String.valueOf(longValue); 
        System.out.println("This is longInString: " + longInString); 

        char chinese = '你';
        String charInString = String.valueOf(chinese);
        System.out.println("This is charInString: " + charInString); 

        boolean b = true; 
        String booleanInString = String.valueOf(b); 
        System.out.println("This is booleanInString: " + booleanInString); 

        int newNumber = 2147483647;
        long newNumberLong = (long) newNumber * 2; 
        System.out.println("This is newNumberLong: " + newNumberLong); 
        long newNumberNoLong = newNumber * 2; 
        System.out.println("This is newNumberNoLong: " + newNumberNoLong); 

        //showing decimal points
        double positive = 5; 
        int divide = 3; 
        // when you take a double divide by int the final result will follow the double
        String decimalRatio = String.format("%.6f" , positive / divide); //this gives 6 decimal places
        System.out.println("This is decimalRatio: " + decimalRatio); 


        //to do substring
        String s = "07:05:45PM"; 
        String time = s.substring(8, 10); // s.substring(8, 10) same as s.substring(8) - 8 is beginIndex, 10 is endIndex
        System.out.println("This is timeInt: " + time); 
        if(s.substring(8).equals("PM")){ //for string cannot ==, need to do .equals
            System.out.println("This is .equals output " + s.substring(8)); 
        }

        //to split a string
        String i = "is the end"; 
        String[] a = i.split(" "); 
        System.out.println("This is the split string: " + Arrays.toString(a));
        System.out.println("This is the individual split string: " + a[0]);

        //to split a string
        String j = "is,the,end"; 
        String[] b1 = j.split(","); 
        System.out.println("This is the split string: " + Arrays.toString(b1));
        System.out.println("This is the individual split string: " + b1[1]);

        String input = "  a b  c d  ";
        String result = input.trim().replaceAll("\\s+", " ");
        System.out.println(result); 

        //Removes all leading and trailing whitespace, Doesn't touch spaces within the string.
        String s1 = "   hello world   ";
        String result1 = s1.trim();  // "hello world"
        System.out.println(s1);
        System.out.println(result1);
    }
    
}
