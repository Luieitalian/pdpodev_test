/**
 * This class provides methods to convert temperature between Celsius and Fahrenheit scales.
 */
public class TemperatureConverter {
    /**
     * Converts temperature from Celsius to Fahrenheit.
     * @param celsius The temperature in Celsius.
     * @return The temperature in Fahrenheit.
     */
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    /**
     * Converts temperature from Fahrenheit to Celsius.
     * @param fahrenheit The temperature in Fahrenheit.
     * @return The temperature in Celsius.
     */
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
