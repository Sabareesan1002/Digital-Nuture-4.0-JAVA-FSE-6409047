// ForecastCalculator.java

public class ForecastCalculator {

    // Recursive method to calculate future value
    public static double futureValue(double initial, double rate, int years) {
        if (years == 0) {
            return initial;
        } else {
            return futureValue(initial, rate, years - 1) * (1 + rate);
        }
    }
}
