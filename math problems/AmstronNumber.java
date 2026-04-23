/*

Check if the Number is Armstrong
You are given an integer n. You need to check whether it is an armstrong number or not. Return true if it is an armstrong number, otherwise return false.
An armstrong number is a number which is equal to the sum of the digits of the number, raised to the power of the number of digits.

Example 1
Input: n = 153
Output: true
Explanation: Number of digits : 3.
13 + 53 + 33 = 1 + 125 + 27 = 153.
Therefore, it is an Armstrong number.

Example 2
Input: n = 12
Output: false
Explanation: Number of digits : 2.
12 + 22 = 1 + 4 = 5.
Therefore, it is not an Armstrong number.

Constraints
0 <= n <= 109

*/

import java.util.Scanner;

public class AmstronNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int count = (int) Math.log10(n) + 1;
    int digit = 0;
    int sum = 0;
    int temp = n;

    while (n != 0) {
      digit = n % 10;
      n = n / 10;
      sum += Math.pow(digit, count);
    }
    if (sum == temp) {
      System.out.println("Amstrong number");
    } else {
      System.out.println("Not an amstrong number");
    }
  }
}
