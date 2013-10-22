public class WhileLoopExample {

    public static void main(String[] args) {
        int count = 1;
        System.out.println("Printing Numbers from 1 to 5");

        // in a while loop, if the initial condition isn't met
        // the loop will never execute.
        while (count <= 5) {
            System.out.println(count);
            count++;
        }
    }
}