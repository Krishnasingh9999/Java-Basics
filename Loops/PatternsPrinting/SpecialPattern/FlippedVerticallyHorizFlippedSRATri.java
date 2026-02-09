import java.util.Scanner;

public class FlippedVerticallyHorizFlippedSRATri {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number ");
    int n = sc.nextInt();
    sc.close();

    // Taking input n=4
    // * * * *
    //   * * *
    //     * *
    //       *

    //for rows
    for(int i=1; i<=n; i++){

      //for space
      for(int j=1; j<=i-1; j++){
        System.out.print("  ");
      }

      // for star
      for(int k=1; k<=n+1-i; k++){
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
