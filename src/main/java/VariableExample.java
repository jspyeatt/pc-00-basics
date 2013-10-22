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
        int posIntVar = 5;              // declare an integer variable
        int negIntVar = -3;             // with single precision
        long longVar = 875023987523453L;// declare a long variable which has double precision.
        byte byteVar = 3;
        short shortVar = 4234;
        float floatVar = 43.5f;         // declare a single precision floating point
        double doubleVar = 5234523.3453d; // declare a double precision floating point
        char charVar = 'b';
        boolean boolTrue = true;
        boolean boolFalse = false;
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
