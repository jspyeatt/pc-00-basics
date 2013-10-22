public class DoWhileLoopExample {

    public static void main(String[] args) {
        int count = 1;
        System.out.println("Printing Numbers from 1 to 5");

        // unlike the while loop, the do/while loop will
        // always execute at least once because the conditional
        // evaluation occurs at the end of the loop.
        do {
            System.out.println(count++);
        } while (count <= 5);
    }
}