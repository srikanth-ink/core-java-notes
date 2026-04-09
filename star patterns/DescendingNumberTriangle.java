/*

input = 5

sample output:

12345
1234
123
12
1

*/

import java.util.Scanner;

public class DescendingNumberTriangle {
  public static void main(String[] args) {

    // take the number of rows as input
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    // outer loop to iterate through each row
    for (int i = 0; i < n; i++) {
      // inner loop to print numbers from 1 to n-i
      for (int j = 0; j < n - i; j++) {
        System.out.print(j + 1);
      }
      // move to the nextline after finishing each row
      System.out.println();
    }
    sc.close();
  }
}