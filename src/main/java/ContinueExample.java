/**
 * This continue keyword causes the logical flow to skip
 * the remainder of the loop and and continue back at the
 * start of the loop.
 */
public class ContinueExample {

    public static void main(String[] args) {
        System.out.println("Odd Numbers");
        for (int i = 1; i <= 10; ++i) {
            if (i % 2 == 0)
                continue;
            // Rest of loop body skipped when i is even
            System.out.print(i + "\t ");
        }
    }
}