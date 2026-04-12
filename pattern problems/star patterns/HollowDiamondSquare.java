/*

input = 5

sample output:

**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********

*/

import java.util.Scanner;

public class HollowDiamondSquare {
  public static void main(String[] args) {
    // take the number of rows as input.
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = 1; i <= 2 * n; i++) {

      // initialize stars and spaces based on before and after n or maximum row
      // number.
      // based on the input.
      int stars = (i <= n) ? n - i + 1 : i - n;
      int spaces = (i <= n) ? 2 * (i - 1) : 2 * (2 * n - i);

      // print stars.
      for (int j = 1; j <= stars; j++) {
        System.out.print("*");
      }
      // print spaces.
      for (int j = 1; j <= spaces; j++) {
        System.out.print(" ");
      }
      // print stars.
      for (int j = 1; j <= stars; j++) {
        System.out.print("*");
      }
      // move to next line after every row iteration.
      System.out.println();
    }
  }
}