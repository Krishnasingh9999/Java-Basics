import java.util.Scanner;

public class CapitalAlphabetFlippedRightTriangle {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number ");
    int n = sc.nextInt();
    sc.close();

    // Taking input n=4
    // A A A A
    // B B B
    // C C
    // D

    for(int i=1; i<=n; i++){
      for(int j=1; j<=n+1-i; j++){
        System.out.print((char)(i+64)+ " ");
      }
      System.out.println();
    }
  }
}
