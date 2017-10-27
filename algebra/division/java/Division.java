/* Division in integer only, implemented in Java.
*
* Takes in 2 integer arguments, x is the numerator, y is denominator
* - Format: java Division [numerator] [denominator]
*
* @author: Mujahid Anuar, github.com/mjhdanuar
*/

import java.io.*;

public class Division {
  public static void main(String[] args) {

    // check for invalid inputs i.e. input should be integers only
    try {
      Integer.parseInt(args[0]);
      Integer.parseInt(args[1]);
    } catch (NumberFormatException e) {
      System.out.println("Please input integers only.");
      System.exit(0);
    }

    if (args.length == 2) {
      int result = divide(Integer.parseInt(args[0]), Integer.parseInt(args[1]));

      if (result != 0)
        System.out.println(result);
      else
        System.out.println("Cannot divide by zero.");

    }
    else {
      System.out.println("Wrong format: java Division [numerator] [denominator]");
    }

  }

/* Divides two integers
* If denominator, y, is zero, return 0
*
*/
  public static int divide(int x, int y) {
    if (y == 0)
      return 0;

    return x/y;
  }
}
