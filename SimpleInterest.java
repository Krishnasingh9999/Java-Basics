import java.util.Scanner;

public class SimpleInterest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the principal: ");
    double p = sc.nextDouble();

    System.out.print("Enter the rate: ");
    double r = sc.nextDouble();

    System.out.print("Enter the time: ");
    double t = sc.nextDouble();
    sc.close();

    double simpleInterest = (p * r * t)/100;
    System.out.println("Simple Interest is: " + simpleInterest);

  }
}
