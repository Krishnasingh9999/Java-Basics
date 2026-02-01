import java.util.Scanner;

public class CheckOddEven {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Please enter the number: ");
    int num = sc.nextInt();
    sc.close();

    if(num%2 == 0){
      System.out.println(num + " is even number");
    }
    else{
      System.out.println(num + " is odd number");
    }

  }
}
