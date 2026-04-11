/*

SAMPLE OUTUT:

input = 5


*****
*****
*****
*****
*****

*/

import java.util.Scanner;

public class SquarePattern {
  public static void main(String[] args) {

    // take the number of rows as input
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();

    // outer loop to iterate through each row
    for (int i = 0; i < n; i++) {
      // inner loop print a star 'n' times for each row
      for (int j = 0; j < n; j++) {
        System.out.print("*");
      }
      // move to the next line after finishing a row
      System.out.println();
    }
  }
}