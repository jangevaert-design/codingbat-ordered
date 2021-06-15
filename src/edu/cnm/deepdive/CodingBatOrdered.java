package edu.cnm.deepdive;

/*

Given three ints, a b c, return true if b is greater than a, and c is greater than b.
However, with the exception that if "bOk" is true, b does not need to be greater than a.

inOrder(1, 2, 4, false) → true
inOrder(1, 2, 1, false) → false
inOrder(1, 1, 2, true) → true
 */

  public class CodingBatOrdered {

    public static void main(String[] args) {
      System.out.printf("if we use the numbers %d, %d and %d and set the boolean as %s, the outcome is "
          + inOrder(1, 2, 4, false) + ".\n", 1, 2, 4, "false");
      System.out.printf("if we use the numbers %d, %d and %d and set the boolean as %s, the outcome is "
          + inOrder(1, 2, 1, false) + ".\n", 1, 2, 1, "false");
      System.out.printf("if we use the numbers %d, %d and %d and set the boolean as %s, the outcome is "
          + inOrder(1, 1, 2, true) + ".\n", 1, 1, 2, "true");
    }


    public static boolean inOrder(int a, int b, int c, boolean bOk) {
      if (bOk) {
        if (c > b) {
          return true;
        }
      } else if (b > a && c > b) {
        return true;
      } else {
        return false;
      }
      return false;
    }
  }

