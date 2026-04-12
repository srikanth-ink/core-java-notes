/*

input = 5

sample output:

**********
*        *
*        *
*        *
**********

*/

import java.util.Scanner;

public class HollowRectangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= 2 * n; j++) {
        if (i == 1 || i == n) {
          System.out.print("*");
        } else if (j == 1 || j == 2 * n) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
    sc.close();
  }
}
