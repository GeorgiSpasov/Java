package w1p1_TempConverterUML_GUI;

public class Celsius {

    private double celsius;

    public Celsius(double tempC) {
        celsius = tempC;
    }

    public void setCelsius(double tempC) {
        celsius = tempC;
    }

    public double getCelsius() {
        return celsius;
    }

    public double convertToFahrenheit() {
        double fahrenheit = 9.0 / 5.0 * getCelsius()  + 32;
        return fahrenheit;
    }
}
