import java.util.Scanner;

public class DiamondPattern {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number ");
    int n = sc.nextInt();
    sc.close();

    // Taking input n=4
    //         *
    //       * * *
    //     * * * * *
    //   * * * * * * *
    //     * * * * *
    //       * * *
    //         *

    // Not Modular 
    // //Upper Pyramid
    // for(int i=1; i<=n; i++){
    //   for(int j=1; j<=n-i; j++){
    //     System.out.print("  ");
    //   }
    //   for(int k=1; k<=2*i-1; k++){
    //     System.out.print("* ");
    //   }
    //   System.out.println();
    // }

    // //Lower Pyramid
    // for(int i=1; i<n; i++){
    //   for(int j=1; j<=i; j++){
    //     System.out.print("  ");
    //   }
    //   for(int l=1; l<=2*(n-i)-1; l++ ){
    //     System.out.print("* ");
    //   }
    //   System.out.println();
    // }

    // Modular 

    int nsp = n-1;
    int nst = 1;

      //Upper Pyramid
    for(int i=1; i<=n; i++){
      for(int j=1; j<=nsp; j++){
        System.out.print("  ");
      }
      for(int k=1; k<=nst; k++){
        System.out.print("* ");
      }
      nsp--;
      nst += 2;
      System.out.println();
    }

    nsp = 1;
    nst = 2*n-3;
    //Lower Pyramid
    for(int i=1; i<n; i++){
      for(int j=1; j<=nsp; j++){
        System.out.print("  ");
      }
      for(int l=1; l<=nst; l++ ){
        System.out.print("* ");
      }
      nsp++;
      nst -= 2;
      System.out.println();
    }
  }
  
}
