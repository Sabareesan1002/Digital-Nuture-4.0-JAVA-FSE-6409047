// ForecastApp.java

public class ForecastApp {
    public static void main(String[] args) {
        double initialAmount = 10000;     // Initial value in ₹
        double annualGrowthRate = 0.08;   // 8% growth rate
        int forecastYears = 5;            // Forecast for 5 years

        double result = ForecastCalculator.futureValue(initialAmount, annualGrowthRate, forecastYears);

        System.out.printf("Future Value after %d years: ₹%.2f%n", forecastYears, result);
    }
}
