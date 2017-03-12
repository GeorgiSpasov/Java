/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w1p2_Rectangle;

/**
 *
 * @author Georgi Spasov
 */
public class Rectangle {
    
    private double width;
    private double height;
    String color;
    
    public Rectangle(double widthR, double heightR, String colorR) {
        if (widthR > 0) width = widthR; else width = 1;
        if (heightR > 0) height = heightR; else height = 1;
        if (color == null) color = colorR; else color = "yellow";
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double widthR) {
        width = widthR;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double heightR) {
        height = heightR;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String colorR) {
        color = colorR;
    }
    
    
    public double getArea() {
        double area = getWidth() * getHeight();
        return area;
    }
    
    public double getPerimeter() {
        double perimeter = (getWidth() + getHeight()) * 2;
        return perimeter;
    }
}
