import java.util.Scanner;

public class FloydsRightAngleTriangle1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number ");
    int n = sc.nextInt();
    sc.close();

    // Taking input n=4
    // 1
    // 2 3
    // 4 5 6
    // 7 8 9 10

    int a=1;
    for(int i=1; i<=n; i++){
      for(int j=1; j<=i; j++){
        System.out.print(a + " ");
        a++;
      }
      System.out.println();
    }
  }
}
