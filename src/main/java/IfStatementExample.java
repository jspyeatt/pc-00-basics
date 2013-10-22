public class IfStatementExample {

    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // single line if statement
        if (a < b) System.out.println("a is less than b");

        if (b > a) System.out.println("b is greater than a");

        // for multiline if statements you have to have an opening
        // and closing bracket.
        if (a > b) {
            System.out.println("*******");
            System.out.println("a > b");
            System.out.println("*******");
        } else {
            System.out.println("======");
            System.out.println("b > a");
            System.out.println("=======");
        }
    }
}