/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w2p1_Menu;

import java.util.Scanner;
/**
 *
 * @author Georgi Spasov
 */
public class ComputeByMenu {

    Scanner input = new Scanner (System.in);
    private double x;

    public ComputeByMenu(double num) {
        if (num == 0) {
            x = 0;
        } else {
            x = num;
        }
    }

    public void displayMenu() {
        for (int i = 0; i <= 60; i++) {
            System.out.println("");
        }
        System.out.println("Menu\nEnter the number of your choice\n"
                + "1. Enter number x with floating point\n"
                + "2. Calculate and print exp(x)\n"
                + "3. Calculate and print sin(x)\n"
                + "4. Calculate and print floor(x)\n"
                + "5. End");
    }

    public void doSelection(int choice) {
        while (choice != 5) {
            choice = input.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter number x with floating point: ");
                    x = input.nextDouble();
                    break;
                case 2:
                    System.out.printf("exp(x) = %f", Math.exp(x));
                    break;
                case 3:
                    System.out.printf("sin(x) = %f", Math.sin(x));
                    break;
                case 4:
                    System.out.printf("floor(x) = %f", Math.floor(x));
                    break;
                case 5:
                    System.out.println("End");
                    break;
                default:
                    System.out.println("Enter a valid choice.");
            }
            
            if (choice != 5) {
                System.out.println("\nEnter your next choice:");
            }
        }
    }

    public void getUserChoice() {
        displayMenu();
        doSelection(0);
    }
}
