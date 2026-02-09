import java.util.Scanner;

public class AlphabetRightAngleTriangle2 {
      public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number ");
    int n = sc.nextInt();
    sc.close();

    // Taking input n=4
    // A
    // B B
    // C C C
    // D D D D

    for(int i=1; i<=n; i++){
      for(int j=1; j<=i; j++){
        System.out.print((char)(i+64) + " ");
      }
      System.out.println();
    }
  }
}
