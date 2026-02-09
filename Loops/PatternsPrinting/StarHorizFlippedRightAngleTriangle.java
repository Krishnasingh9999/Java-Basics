import java.util.Scanner;

public class StarHorizFlippedRightAngleTriangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number ");
    int n = sc.nextInt();
    sc.close();

    // Taking input n=4
    // * * * *
    // * * *
    // * * 
    // * 

    // Best, readable, clean, interview-friendly and Standard
    for(int i=1; i<=n; i++){
      for(int j=1; j<=n+1-i; j++){
        System.out.print("* ");
      }
      System.out.println();
    }

    // //not standard and less flexible
    // for(int i=1; i<=n; i++){
    //   for(int j=i; j<=n; j++){
    //     System.out.print(j+" ");
    //   }
    //   System.out.println();
    // }

    // //Also not standard and confusing why reversed logic
    // for(int i=1; i<=n; i++){
    //   for(int j=n; j>=i; j--){
    //     System.out.print(j+" ");
    //   }
    //   System.out.println();
    // }


    int a = n;                     
    for(int i=1; i<=n; i++){
      for(int j=1; j<=a; j++){
        System.out.print("* ");
      }
      a--;
      System.out.println();
    }
    
  }
  
}