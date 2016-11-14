// LargeSmall.java
// Calculates the largest and smallest
// of five integers entered one at a time.
package w1p5_Exercises;
// Java core packages

import java.awt.*;

// Java extension packages
import javax.swing.*;

public class LargeSmall {

    // Compute the smallest and the largest among 4 input numbers
    // obtain numerical input and determine results
    public static void main(String[] args) {
        String dataString;   // output string
        String smallString;  // smallest number string
        String largeString;  // largest number string
        String input;     // string entered by user
        int largest, smallest; // largest and smallest integers

        // variables to store integers input by user
        int firstNumber, secondNumber, thirdNumber,
                fourthNumber, fifthNumber;

        // obtain first value
        input = JOptionPane.showInputDialog("Enter first number :");
        firstNumber = Integer.parseInt(input);

        /* Read second number from user and assign it to variable secondNumber */
        input = JOptionPane.showInputDialog("Enter second number :");
        secondNumber = Integer.parseInt(input);
        /* Compare variables smallest and largest 
      with the input and set them appropriately */
        if (firstNumber > secondNumber) {
            largest = firstNumber;
            smallest = secondNumber;
        } else {
            largest = secondNumber;
            smallest = firstNumber;
        }

        /* Perform the same steps with the
      third, fourth and fifth values */
        input = JOptionPane.showInputDialog("Enter third number :");
        thirdNumber = Integer.parseInt(input);
        input = JOptionPane.showInputDialog("Enter fourth number :");
        fourthNumber = Integer.parseInt(input);
        input = JOptionPane.showInputDialog("Enter fifth number :");
        fifthNumber = Integer.parseInt(input);
        //third number
        if (thirdNumber > fourthNumber && thirdNumber > fifthNumber && thirdNumber > largest) {
            largest = thirdNumber;
            if (fourthNumber < fifthNumber && fourthNumber < smallest ) {
                smallest = fourthNumber;
            }
            else{
                smallest = fifthNumber;
            }
        }
        //fourth number
        if (fourthNumber > thirdNumber && fourthNumber > fifthNumber && fourthNumber > largest) {
            largest = fourthNumber;
            if (thirdNumber < fifthNumber && thirdNumber < smallest ) {
                smallest = thirdNumber;
            }
            else if (fifthNumber < smallest){
                smallest = fifthNumber;
            }
        }
        //fifth number
        if (fifthNumber > thirdNumber && fifthNumber > fourthNumber && fifthNumber > largest) {
            largest = fifthNumber;
            if (thirdNumber < fourthNumber && thirdNumber < smallest ) {
                smallest = fourthNumber;
            }
            else if (fourthNumber < smallest){
                smallest = fourthNumber;
            }
        }
        /* Create a formatted output String  with the obtained  
         smallest and largest input numbers*/
        System.out.printf("Smallest number is %d./n", smallest);
        System.out.printf("Largest number is %d./n", largest);
        
        dataString = String.format("Smallest number is %d. Largest number is %d.", smallest, largest);
        JOptionPane.showMessageDialog( null, dataString );
 /* Output the formatted output String  using a dialog box */
    }// end method main
}  // end class LargeSmall

