import java.util.Scanner;

public class AreaOfCircle {

  public static void main(String[] args) {
    // //By Hard coding
    // double radius = 7;

    //taking input from user through Scanner class object
    Scanner sc = new Scanner(System.in);
    System.out.print("Please enter the radius of the circle: ");
    double radius = sc.nextDouble();
    sc.close();

    // Area of circle = pi(3.141592...) * r * r
    double area = Math.PI*radius*radius; 
    System.out.println("The area of circle is: " + area);
  }
}
