/*

Divisors of a Number

You are given an integer n. You need to find all the divisors of n. Return all the divisors of n as an array or list in a sorted order.
A number which completely divides another number is called it's divisor.


Example 1

Input: n = 6
Output = [1, 2, 3, 6]
Explanation: The divisors of 6 are 1, 2, 3, 6.

Example 2
Input: n = 8
Output: [1, 2, 4, 8]
Explanation: The divisors of 8 are 1, 2, 4, 8.

Constraints
1 <= n <= 1000

*/

import java.util.Scanner;

public class Divisors {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    logic(n);
  }

  public static void logic(int n) {
    int initialDiv = 1;
    int finalDiv = n;
    System.out.print("[" + initialDiv + ", ");
    for (int i = 2; i < n; i++) {
      if (n % i == 0) {
        System.out.print(i + ", ");
      }
    }
    System.out.print(finalDiv + "]");
  }
}