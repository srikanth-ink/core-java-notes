/*

input = 5

sample output:

A
BB
CCC
DDDD
EEEEE

*/

import java.util.Scanner;

public class RightRepeatedAlphabetTriangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    // Outer loop to iterate through each row.
    for (int i = 1; i <= n; i++) {
      // Inner loop to iterate through each column.
      for (int j = 0; j < i; j++) {
        // Type cast and print characters based on ASCII format.
        System.out.print((char) (64 + i));
      }
      // Move to next line after each row iteration.
      System.out.println();
    }

    sc.close();
  }
}