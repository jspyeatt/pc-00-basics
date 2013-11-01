/*
 * Comments in code are sections that you can flag and the
 * compiler will ignore it.
 *
 * Comments are typically used to describe complicated sections of
 * the code, give attribution or describe how someone would use the
 * code.
 *
 * Comments can be 'block comments' like the one I am using to
 * describe this section. These types of comments cannot have
 * any executable code in the.
 *
 * The second type is an inline comment which starts with //
 * Anything after the // will be ignored by the compiler and
 * not process any of the characters from the // to the end of line
 * character.
 *
 * The final type is a javadoc comment which will be discussed later.
 */

// NOTE that each executable line is terminated with a ';'
public class VariableExample {
    public static void main(String args[]) {

        // an 'int' data type is used to store integers. They can
        // be negative or positive values between -2147483648 and
        // 2147483647  (-2^31 to 2^31-1)
        int posIntVar = 5;              // declare an integer variable
        int negIntVar = -3;             // with single precision

        // a 'long' data type is used to store bigger integers. They can
        // be negative or positive values between.
        // -9223372036854775808 and 9223372036854775807 (-2^63 tp 2^63-1)
        // you need to append an L so the compiler knows you are assigning
        // a long value.
        long longVar = 875023987523453L;// declare a long variable which has double precision.

        // a byte can store up to 8 bits -128 to 127 (2^8 to 2^8-1)
        byte byteVar = 3;

        // a short can store values between -32768 and 32767 (-2^15 to 2^15-1)
        short shortVar = 4234;

        // a float stores a single-precision floating point (decimal) number.
        // it can store values from +/-1.4E-45 to +/-3.4028E+38
        float floatVar = 43.5f;         // declare a single precision floating point

        // a double stores a double-presition floating point (decimal) number.
        // it can store values from +/-439E-324 to +/-1.79769E+308
        double doubleVar = 5234523.3453d; // declare a double precision floating point

        // a char stores a single character value. Note that you use single quote character
        // to surround your character.
        char charVar = 'b';

        // boolean values can be true or false. That's it.
        boolean boolTrue = true;
        boolean boolFalse = false;

        // A String is technically an object, but is still considered a basic data type.
        // It can contain multiple characters. Note that it has to be surrounded by
        // double quote characters.
        String stringVar = "This is a string. Notice the double quotes.";

        System.out.println("posIntVar = " + posIntVar);
        System.out.println("negIntVar = " + negIntVar);
        System.out.println("longVar = " + longVar);
        System.out.println("byteVar = " + byteVar);
        System.out.println("shortVar = " + shortVar);
        System.out.println("floatVar = " + floatVar);
        System.out.println("doubleVar = " + doubleVar);
        System.out.println("charVar = " + charVar);
        System.out.println("boolTrue = " + boolTrue);
        System.out.println("boolFalse = " + boolFalse);
        System.out.println("stringVar = " + stringVar);
    }
}
