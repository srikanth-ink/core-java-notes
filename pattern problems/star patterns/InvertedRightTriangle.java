/*

input = 5

sample output:

*****
****
***
**
*

*/

import java.util.Scanner;

public class InvertedRightTriangle {
  public static void main(String[] args) {

    // take the number of rows as input
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    // outer loop to iterate through each row
    for (int i = 0; i < n; i++) {
      // inner loop to print (n - current row number) stars
      for (int j = 0; j < n - i; j++) {
        System.out.print("*");
      }
      // move to next line after finishing a row
      System.out.println();
    }
    sc.close();
  }
}