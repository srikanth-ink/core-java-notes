import java.util.Scanner;

public class SquarePattern {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // take number of rows as input
    int input = (int) sc.nextInt();
    sc.close();

    // outer loop to enter every row
    for (int i = 0; i < input; i++) {
      // inner loop to enter every column
      for (int j = 0; j < input; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}