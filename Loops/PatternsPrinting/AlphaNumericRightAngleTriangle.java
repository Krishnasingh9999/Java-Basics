import java.util.Scanner;

public class AlphaNumericRightAngleTriangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number ");
    int n = sc.nextInt();
    sc.close();

    // Taking input n=5
    // 1
    // A B
    // 1 2 3
    // A B C D
    // 1 2 3 4 5

    for(int i=1; i<=n; i++){
      for(int j=1; j<=i; j++){
        if(i%2 == 1){
          System.out.print(j + " ");
        }else{
          System.out.print((char)(j+64) + " ");
        }
      }
      System.out.println();
    }

  }
}