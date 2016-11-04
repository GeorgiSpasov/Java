/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatesting;

import java.util.Scanner;

/**
 *
 * @author Shadow
 */
public class JavaTesting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println("Welcome\nto\nJava\nProgramming!");
        System.out.printf("%s\n%s\n", "Welcome to", "Java Programming!");
        
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter number:");
        int number = input.nextInt();
        System.out.println(number);
        
    }

}
