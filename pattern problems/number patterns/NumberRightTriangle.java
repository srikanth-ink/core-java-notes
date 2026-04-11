/*

SAMPLE OUTUT:

input = 5


1
12
123
1234
12345

*/

import java.util.Scanner;

public class NumberRightTriangle {
  public static void main(String[] args) {

    // take the number of rows as input
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    // outer loop to iterate through each row
    for (int i = 0; i < n; i++) {
      // inner loop to print numbers from the 1 till the current row number
      for (int j = 0; j <= i; j++) {
        System.out.print(j + 1 + " ");
      }
      // move to the next line when finished a row
      System.out.println();
    }
    sc.close();
  }
}