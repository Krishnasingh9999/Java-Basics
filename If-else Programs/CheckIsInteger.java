import java.util.Scanner;

public class CheckIsInteger {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Please enter the number: ");
    double num = sc.nextDouble();

    //Not for big decimal input due to precision, if we want then use BigDecimal class
    // int x = (int)num;
    // if(num - x == 0){
    //   System.out.println("It is integer");
    // }else{
    //   System.out.println("Not is integer");
    // }

    // if(num%1 == 0){
    //   System.out.println("It is integer");
    // }else{
    //   System.out.println("Not is integer");
    // }

    if(num == (int)num){
      System.out.println("It is integer");
    }else{
      System.out.println("Not is integer");
    }

    sc.close();
  }
}
