/**
 * This class demonstrates the use of the 'break' keyword
 * within a loop. When your code executes the break statement
 * all subsequent statements in the loop are skipped and the loop
 * is exited.
 */
public class BreakExample {

    public static void main(String[] args) {
        System.out.println("Numbers 1 - 10");
        for (int i = 1;; ++i) {
            if (i == 11)
                break;
            // Rest of loop body skipped when i is even
            System.out.print(i + " \t");
        }
    }
}