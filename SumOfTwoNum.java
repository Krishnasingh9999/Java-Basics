import java.util.Scanner;

public class SumOfTwoNum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the first number: ");
    int num1 = sc.nextInt();

    System.out.print("Enter the second number: ");
    int num2 = sc.nextInt();

    sc.close();

    int sum = num1 + num2;

    System.out.println("The sum of two number is: "+sum);

  }
}
