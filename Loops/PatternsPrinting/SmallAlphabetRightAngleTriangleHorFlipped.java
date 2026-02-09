import java.util.Scanner;

public class SmallAlphabetRightAngleTriangleHorFlipped {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number ");
    int n = sc.nextInt();
    sc.close();

    // Taking input n=4
    // a b c d
    // a b c 
    // a b 
    // a 

    for(int i=1; i<=n; i++){
      for(int j=1; j<=n+1-i; j++){
        System.out.print((char)(j+96)+ " ");
      }
      System.out.println();
    }
  }
}
