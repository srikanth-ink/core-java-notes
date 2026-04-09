/*

SAMPLE OUTUT:

input = 5


1
22
333
4444
55555

*/

import java.util.Scanner;

public class SameNumberRightTriangle {

  public static void main(String[] args) {

    // take the number of rows as input
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    // outer loop to iterate through every row
    for (int i = 0; i < n; i++) {
      // Inner loop to print the number for each column
      // Print the row number (i + 1), repeated 'i + 1' times
      for (int j = 0; j <= i; j++) {
        System.out.print(i + 1);
      }
      // move to next line after iterating through a row
      System.out.println();
    }
    sc.close();
  }
}