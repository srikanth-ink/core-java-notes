/*

input = 5

sample output:

*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *


*/

import java.util.Scanner;

public class ButterflyPattern {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = 1; i <= 2 * n - 1; i++) {
      int stars = (i <= n) ? i : 2 * n - i;
      int spaces = (i <= n) ? 2 * (n - i) : 2 * (i - n);

      // print stars
      for (int j = 1; j <= stars; j++) {
        System.out.print("*");
      }
      // print spaces
      for (int j = 1; j <= spaces; j++) {
        System.out.print(" ");
      }

      // print stars
      for (int j = 1; j <= stars; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    sc.close();
  }
}