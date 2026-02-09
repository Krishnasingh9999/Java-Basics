import java.util.Scanner;

public class BinaryRightAngleTriangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number ");
    int n = sc.nextInt();
    sc.close();

    // Taking input n=4
    // 1
    // 0 1
    // 1 0 1
    // 0 1 0 1

    // Worst code
    // for(int i=1; i<=n; i++){
    //   for(int j=1; j<=i; j++){
    //     if(i%2 == 1 && j%2 == 1){
    //       System.out.print("1 ");
    //     }
    //     else if(i%2 == 0 && j%2 == 1){
    //       System.out.print("0 ");
    //     }
    //     else if(i%2 == 0 && j%2 == 0){
    //       System.out.print("1 ");
    //     }
    //     else{
    //       System.out.print("0 ");
    //     }
    //   }
    //   System.out.println();
    // }

    //Best, first of all find pattern then easy pattern
    // O+O =E, E+E =E, O+E = O, E+O = E,  here E = Even and O= Odd
    for(int i=1; i<=n; i++){
      for(int j=1; j<=i; j++){
        if((i+j)%2 == 0){
          System.out.print("1 ");
        }else{
          System.out.print("0 ");
        }
      }
      System.out.println();
    }
    
  }
}
