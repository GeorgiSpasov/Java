/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w1p2_Rectangle;
import javax.swing.JOptionPane;

import java.util.Scanner;
/**
 *
 * @author Georgi Spasov
 */
public class RectangleTest {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner( System.in );
        
        double width;
        double height;
        String color;
        
        width = Double.parseDouble(JOptionPane.showInputDialog("Enter width"));
        height = Double.parseDouble(JOptionPane.showInputDialog("Enter height"));
        color = JOptionPane.showInputDialog("Enter color");
        
        Rectangle rectangleTest = new Rectangle(width, height, color);
        
        System.out.printf("Rectangle's area: %.2f, perimeter: %.2f, color: %s.",
                           rectangleTest.getArea(),
                           rectangleTest.getPerimeter(),
                           rectangleTest.getColor());
    }
}
