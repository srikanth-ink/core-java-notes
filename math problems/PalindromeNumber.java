import java.util.Scanner;

public class PalindromeNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String n = sc.nextLine();
    boolean res = logic(n);
    System.out.println(res);
  }

  // public static boolean logic(String n) {
  // String newStr = "";
  // int len = n.length();

  // for (int i = len - 1; i >= 0; i--) {
  // newStr += n.charAt(i);
  // }

  // if (n.equals(newStr)) {
  // return true;
  // }
  // return false;

  // better optimized solution
  public static boolean logic(String n) {
    int left = 0;
    int right = n.length() - 1;

    while (left < right) {
      if (n.charAt(left) != n.charAt(right)) {
        return false;
      }
      left++;
      right--;
    }
    return true;
  }
}
