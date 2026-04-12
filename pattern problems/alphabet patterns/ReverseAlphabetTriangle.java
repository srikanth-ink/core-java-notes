/*

input = 5

sample output:

E 
D E 
C D E 
B C D E 
A B C D E

*/

import java.util.Scanner;

public class ReverseAlphabetTriangle {
  public static void main(String[] args) {

    // take the number of rows as user input
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    // iterate through each row
    for (int i = 0; i < n; i++) {
      // iterate through each column
      for (int j = 0; j <= i; j++) {
        // expression to print reverse alphabets
        System.out.print((char) ((64 + n) - (i - j)) + " ");
      }
      // move to next line after every row iteration
      System.out.println();
    }

    sc.close();
  }
}