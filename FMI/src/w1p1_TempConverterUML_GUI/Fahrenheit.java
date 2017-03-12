package w1p1_TempConverterUML_GUI;

public class Fahrenheit {

    private double fahrenheit;

    public Fahrenheit(double tempF) {
        fahrenheit = tempF;
    }

    public void setFahrenheit(double tempF) {
        fahrenheit = tempF;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public double convertToCelsius() {
        double celsius = 5.0 / 9.0 * (getFahrenheit() - 32);
        return celsius; 
    }
}
