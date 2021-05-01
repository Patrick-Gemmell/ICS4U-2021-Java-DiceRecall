/*
* This program will allow the user to enter a minimum and maximum number and
* the computer will find a random number in between the specified numbers.
*
* @author  Patrick Gemmell
* @version 1.0
* @since   2021-04-29
*/

import java.util.Scanner;  // Import the Scanner class

public final class DiceRecall {
    private DiceRecall() {

    }
  /**
   * This function will find a random number between the values
   * specified by the user.
   * @return
   * calls back function.
   * @param minValue
   * @param maxValue
   */
  static int rollDie(final int minValue, final int maxValue) {
    // Generating random number in the specified range
    int randomNumber = (int) (Math.random() * ((maxValue - minValue))
                        + 1) + minValue;

    // Returning the random number
    return randomNumber;
  }

  /**
   * This function will allow the user to enter a minimum and maximum number
   * and return a random number within the specified values.
   * @param args
   */
  public static void main(final String[] args) {
    try {
      // Input for the minimum range of the dice
      Scanner minRangeInput = new Scanner(System.in);
      System.out.println("Enter the minimum range you would like"
                         + " for the dice (integer):");
      int userMinRange = minRangeInput.nextInt();
      System.out.println();

      // Input for the maximum range of the dice
      Scanner maxRangeInput = new Scanner(System.in);
      System.out.println("Enter the maximum range you would like"
                         + " for the dice (integer):");
      int userMaxRange = maxRangeInput.nextInt();
      System.out.println();

      // Process
      int number = rollDie(userMinRange, userMaxRange);

      // Output
      System.out.println("The random number is " + number);

      // Catches and tells the user that an improper input was entered
    } catch (Exception e) {
      System.out.println();
      System.out.println("Invalid Input");
    }
  }
}
