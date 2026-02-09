import java.util.Scanner;

public class NumberRightAngleTriangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number ");
    int n = sc.nextInt();
    sc.close();

    // Taking input n=4
    // 1
    // 1 2
    // 1 2 3
    // 1 2 3 4

    for(int i=1; i<=n; i++){
      for(int j=1; j<=i; j++){
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }
}
