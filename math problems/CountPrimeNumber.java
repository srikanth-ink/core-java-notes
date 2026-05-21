/*

Count of Prime Numbers till N

You are given an integer n. You need to find out the number of prime numbers in the range [1, n] (inclusive). Return the number of prime numbers in the range.
A prime number is a number which has no divisors except, 1 and itself.


Example 1
Input: n = 6
Output: 3
Explanation: Prime numbers in the range [1, 6] are 2, 3, 5.

Example 2
Input: n = 10
Output: 4
Explanation: Prime numbers in the range [1, 10] are 2, 3, 5, 7.

Constraints
2 <= n <= 1000

 */

import java.util.Scanner;

public class CountPrimeNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();
    int res = logic(n);
    System.out.println(res);
  }

  public static int logic(int n) {
    // assuming that the edge cases should return 0
    if (n < 2 || n > 1000) {
      return 0;
    }
    int count = 2;
    for (int i = 2; i * i < n; i++) {
      if (i % 2 == 0) {
        count++;
      }
    }
    return count;
  }
}