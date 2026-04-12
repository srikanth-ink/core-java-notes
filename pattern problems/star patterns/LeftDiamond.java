/*

input = 5

sample output:

    *
   **
  ***
 ****
*****
 ****
  ***
   **
    *

*/

import java.util.Scanner;

public class LeftDiamond {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    // upper part
    for (int i = 1; i <= n; i++) {

      // inner loop to print spaces
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }

      // inner loop to print stars
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      // move to next line after completing the iteration in a row
      System.out.println();
    }

    // lower part
    for (int i = 1; i < n; i++) {
      // print spaces
      for (int j = 1; j <= i; j++) {
        System.out.print(" ");
      }
      // print stars
      for (int j = 1; j <= n - i; j++) {
        System.out.print("*");
      }
      // move to next line after completing the iteration in a row
      System.out.println();
    }
    sc.close();
  }
}
