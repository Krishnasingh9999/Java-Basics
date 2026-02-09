import java.util.Scanner;

public class OddNumberTriangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number ");
    int n = sc.nextInt();
    sc.close();

    //Taking input n=4
    // 1
    // 1 3 
    // 1 3 5
    // 1 3 5 7

    // for(int i=1; i<=n; i++){
    //   int a=1;
    //   for(int j=1; j<=i; j++){
    //     System.out.print(a + " ");
    //     a=a+2;
    //   }
    //   System.out.println();
    // }

    
    for(int i=1; i<=n; i++){
      for(int j=1; j<=i; j++){
        System.out.print(2*j-1 + " ");
      }
      System.out.println();
    }
  }
}
