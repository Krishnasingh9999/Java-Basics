import java.util.Scanner;

public class AlphabetTriangleVertFlipped {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number ");
    int n = sc.nextInt();
    sc.close();

    // Taking input n=4
    //         A
    //       B B
    //     C C C
    //   D D D D 

    //for rows
    for(int i=1; i<=n; i++){

      //for space
      for(int j=1; j<=n-i; j++){
        System.out.print("  ");
      }

      // for star
      for(int k=1; k<=i; k++){
        System.out.print((char)(i+64) + " ");
      }
      System.out.println();
    }
  }
}
