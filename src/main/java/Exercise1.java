/**
 * In this example I would like you to write a short program that
 * converts from Fahrenheit to Celcius.
 * <p/>
 * The equation for this conversion is as follow:
 * <p/>
 * C = 5(F - 32)
 * -
 * 9
 * <p/>
 * For this example you can hard-wire your fahrenheit temperature.
 * <p/>
 * A couple of hints:
 * 1) You want to use floating point arithmetic, not integers
 * 2) To output your result to the screen you can use the following
 *    method.
 * System.out.println();
 */
public class Exercise1 {

    public static void main(String args[]) {
        float fahrenheitTemperature = 0.0f;
        if (args.length > 0) {
            fahrenheitTemperature = Float.parseFloat(args[0]);
        }

        float celsiusTemperature = 0.0f;

        // enter your code to convert from fahrenheit to celsius here.


        // print your results
        System.out.println(fahrenheitTemperature + " F is " + celsiusTemperature + " C");
    }
}
