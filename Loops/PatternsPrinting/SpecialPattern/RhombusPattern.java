import java.util.Scanner;

public class RhombusPattern {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number ");
    int n = sc.nextInt();
    sc.close();

    // Taking input n=4
    //         * * * *
    //       * * * *
    //     * * * *
    //   * * * *

    //for rows
    for(int i=1; i<=n; i++){

      //for space
      for(int j=1; j<=n-i; j++){
        System.out.print("  ");
      }

      // for left side star
      for(int k=1; k<=n; k++){
        System.out.print( "* ");
      }

      System.out.println();
    }
  }
}
