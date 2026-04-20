/*

Reverse Integer

Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

Sample input x = 245
Sample output = 542

Sample input x = -123
Sample output =  -321

*/

import java.util.Scanner;

public class ReverseInteger {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    ReverseInteger obj = new ReverseInteger();
    int res = obj.logic(n);
    System.out.println(res);
  }

  public static int logic(int n) {
    int rem = 0;
    int res = 0;
    do {
      rem = n % 10;
      n = n / 10;
      if (res < Integer.MIN_VALUE || res > Integer.MAX_VALUE && res > 7) {
        return 0;
      } else if (res < Integer.MIN_VALUE || res > Integer.MAX_VALUE && res < -8) {
        return 0;
      } else {
        res = res * 10 + rem;
      }
    } while (n != 0);
    return res;
  }
}