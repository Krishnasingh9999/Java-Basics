import java.util.*;

public class IsAreaGreaterThanPerimeter {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Please enter the length of rectangle: ");
    int l = sc.nextInt();

    System.out.print("Please enter the breadth of rectangle: ");
    int b = sc.nextInt();

    int perimeter = 2*(l+b);
    int area = l*b;

    if(area > perimeter){
      System.out.println("Area is greater than perimeter");
    }else{
      System.out.println("Perimeter is greater than area");
    }

    sc.close();
  }
}
