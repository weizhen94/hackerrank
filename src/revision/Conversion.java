package revision;

public class Conversion {

    public static void main(String args[]){

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
    }
    
}
