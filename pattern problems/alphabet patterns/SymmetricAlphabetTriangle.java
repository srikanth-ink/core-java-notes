/*

input = 5

sample output:

    A
   ABA
  ABCBA
 ABCDCBA
ABCDEDCBA

*/

import java.util.Scanner;

public class SymmetricAlphabetTriangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {

      // print spaces
      for (int j = 1; j <= (n - i); j++) {
        System.out.print(" ");
      }

      // Print ascending characters
      for (int j = 1; j <= i; j++) {
        System.out.print((char) (64 + j));
      }

      // Print descending characters
      for (int j = 1; j < i; j++) {
        System.out.print((char) ((65 + i - 1) - j));
      }
      // move to next line after every row iteration
      System.out.println();
    }
    sc.close();
  }
}