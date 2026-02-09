import java.util.Scanner;

public class StarRighAngTriVerticallyFliipped {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number ");
    int n = sc.nextInt();
    sc.close();

    // Taking input n=5
    //         *
    //       * *
    //     * * *
    //   * * * * 
    // * * * * *

    // //good
    // for(int i=1; i<=n; i++){
    //   for(int j=1; j<=n; j++){
    //     if(i+j>n) System.out.print("* ");
    //     else System.out.print("  ");
    //   }
    //   System.out.println();
    // }


    //best
    //for rows
    for(int i=1; i<=n; i++){

      //for space
      for(int j=1; j<=n-i; j++){
        System.out.print("  ");
      }

      // for star
      for(int k=1; k<=i; k++){
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
