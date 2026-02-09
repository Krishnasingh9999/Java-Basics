import java.util.Scanner;

public class NumRighAnglTriVertFlip {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number ");
    int n = sc.nextInt();
    sc.close();

    // Taking input n=5
    //         1
    //       1 2
    //     1 2 3
    //   1 2 3 4
    // 1 2 3 4 5

    //for rows
    for(int i=1; i<=n; i++){

      //for space
      for(int j=1; j<=n-i; j++){
        System.out.print("  ");
      }

      // for star
      for(int k=1; k<=i; k++){
        System.out.print(k + " ");
      }
      System.out.println();
    }
  }
}
