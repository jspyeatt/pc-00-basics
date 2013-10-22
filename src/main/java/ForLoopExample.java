public class ForLoopExample {

    public static void main(String[] args) {
        System.out.println("Printing Numbers from 1 to 11 by 2s");

        // a for loop contains three components.
        //   the initial value of the counter
        //   the condition that will cause the loop to exit
        //   a counter that will be executed once per trip through the loop.
        for (int count = 1; count <= 11; count += 2) {
            System.out.println(count);
        }
    }
}