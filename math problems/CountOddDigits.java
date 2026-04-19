/*

Count number of odd digits in a number
You are given an integer n. You need to return the number of odd digits present in the number.
The number will have no leading zeroes, except when the number is 0 itself.

Input: n = 5
Output: 1

Input: n = 25
Output: 1

*/

import java.util.Scanner;

public class CountOddDigits {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // input to handle negative values
    int n = Math.abs(sc.nextInt());
    int count = 0;
    int rem = 0;

    // to handle 0
    do {
      rem = n % 10;
      n = n / 10;
      if (rem % 2 != 0) {
        count++;
      }
    } while (n > 0);
    System.out.println(count);
  }
}