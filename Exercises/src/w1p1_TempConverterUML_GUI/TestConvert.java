/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w1p1_TempConverterUML_GUI;
import javax.swing.JOptionPane;
/**
 *
 * @author Georgi Spasov
 */
public class TestConvert {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int inputCelsius = Integer.parseInt(JOptionPane.showInputDialog("Enter Celsius"));
        int inputFahrenheit = Integer.parseInt(JOptionPane.showInputDialog("Enter Fahrenheit"));
        
        Celsius testC = new Celsius(inputCelsius);
        Fahrenheit testF = new Fahrenheit(inputFahrenheit);
        
        String convertedCelsius = String.format("%.2f Celsius = %.2f Fahrenheit", testC.getCelsius(), testC.convertToFahrenheit());
        JOptionPane.showMessageDialog( null, convertedCelsius );
        
        
        String convertedFahrenheit = String.format("%.2f Fahrenheit = %.2f Celsius", testF.getFahrenheit(), testF.convertToCelsius());
        JOptionPane.showMessageDialog( null, convertedFahrenheit );
    }
    
}
