import java.util.Scanner;

public class SquareOfNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number: ");
    int num = sc.nextInt();
    sc.close();

    int square = num * num;
    System.out.println("The Square of a number is: " + square);
  }
}
