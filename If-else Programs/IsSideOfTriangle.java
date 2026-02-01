import java.util.*;
public class IsSideOfTriangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Please enter the first side of Triangle: ");
    int a = sc.nextInt();

    System.out.print("Please enter the second side of Triangle: ");
    int b = sc.nextInt();

    System.out.print("Please enter the third side of Triangle: ");
    int c = sc.nextInt();

    if((a+b > c) && (b+c > a) && (a+c) > b){
      System.out.println("All are sides of triangle");
    }
    else{
      System.out.println("Not sides of triangle");
    }

    sc.close();
  }
}
