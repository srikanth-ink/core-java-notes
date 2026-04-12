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

public class RightDiamond {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    // iterate though each row
    for (int i = 1; i <= (2 * n) - 1; i++) {
      // calculate the stars to print columns
      int stars = (i <= n) ? i : 2 * n - i;
      // iterate through each column
      for (int j = 0; j < stars; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    sc.close();
  }
}

// double for loop approach

// // upper triangle
// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= i; j++) {
// System.out.print("*");
// }
// System.out.println();
// }

// // lower triangle
// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= n - i; j++) {
// System.out.print("*");
// }
// System.out.println();
// }