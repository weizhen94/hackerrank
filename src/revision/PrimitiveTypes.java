package revision;

public class PrimitiveTypes {

    public static void main(String args[]){
        //String numberString = "3";
        //System.out.println("This is string: " + numberString);  
        // int number = 3; // primitive type 2: int no capital
        // int numberInt = Integer.parseInt(numberString); // this is the way to convert string to int
        // System.out.println("This is int: " + numberInt); 

        // byte: Stores whole numbers from -128 to 127 (8-bit signed integer)
        byte byteValue = 100; //byte no capital
        System.out.println("This is byte: " + byteValue);

        // short: Stores whole numbers from -32,768 to 32,767 (16-bit signed integer)
        short shortValue = 30000; //short no capital
        System.out.println("This is short: " + shortValue);

        // int: Stores whole numbers from -2,147,483,648 to 2,147,483,647 (32-bit signed integer)
        int intValue = 100000; //int no capital
        System.out.println("This is int: " + intValue);

        // long: Stores whole numbers from -9 quintillion to 9 quintillion, -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 (64-bit signed integer)
        long longValue = 10000000000L; // Note the 'L' at the end //long no capital
        System.out.println("This is long: " + longValue);

        // float: Stores 32-bit floating-point numbers (single-precision), 6 to 7 decimal digits of precision
        float floatValue = 3.1415926f; // Note the 'f' at the end //float no capital
        System.out.println("This is float: " + floatValue); // output: This is float: 3.1415925

        // double: Stores 64-bit floating-point numbers (double-precision), 15–16 decimal digits of precision
        double doubleValue = 3.1415926; //double no capital
        System.out.println("This is double: " + doubleValue); // output: This is double: 3.1415926 (more precision)

        // boolean: Stores true or false
        boolean booleanValue = true;
        System.out.println("This is boolean: " + booleanValue);

        // char: Stores a single 16-bit Unicode character, which includes: Latin characters (A, B, Z, etc.), Numbers, commmon symbols, Most languages like Chinese, Japanese, Hindi, etc.
        char letter = 'A'; // English letter
        char number = '7'; // Digit
        char symbol = '$'; // Symbol
        char chinese = '你'; // Chinese character
        char tamil = 'அ'; // Tamil letter
        char unicodeHex = '\u03A9'; // Greek Omega character (Ω)

        System.out.println("Letter: " + letter);
        System.out.println("Number: " + number);
        System.out.println("Symbol: " + symbol);
        System.out.println("Chinese character: " + chinese);
        System.out.println("Tamil character: " + tamil);
        System.out.println("Unicode Ω: " + unicodeHex);

    }
    
}
