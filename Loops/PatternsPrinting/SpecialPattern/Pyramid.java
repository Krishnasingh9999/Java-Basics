import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number ");
    int n = sc.nextInt();
    sc.close();

    // Taking input n=5
    //         *
    //       * * *
    //     * * * * *
    //   * * * * * * *

    //// Good Approach
    // //for rows
    // for(int i=1; i<=n; i++){

    //   //for space
    //   for(int j=1; j<=n-i; j++){
    //     System.out.print("  ");
    //   }

    //   // for stars
    //   for(int k=1; k<=i; k++){
    //     System.out.print("* ");
    //   }

    //   for(int l=1; l<=i-1; l++){
    //     System.out.print("* ");
    //   }
    //   System.out.println();
    // }

    //// Better Approach
    //   for(int i=1; i<=n; i++){

    //   //for space
    //   for(int j=1; j<=n-i; j++){
    //     System.out.print("  ");
    //   }

    //   // for stars
    //   for(int k=1; k<=2*i-1; k++){
    //     System.out.print("* ");
    //   }

    //   System.out.println();
    // }

    // Best Approach
    int nsp = n-1;
    int nst = 1;
      for(int i=1; i<=n; i++){

      //for space
      for(int j=1; j<=nsp; j++){
        System.out.print("  ");
      }

      // for stars
      for(int k=1; k<=nst; k++){
        System.out.print("* ");
      } 
      nsp--;
      nst+=2;

      System.out.println();
    }
  }
}
