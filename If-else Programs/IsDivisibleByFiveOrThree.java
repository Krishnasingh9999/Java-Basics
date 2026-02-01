import java.util.*;

public class IsDivisibleByFiveOrThree {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Please enter the positive number: ");
    int num = sc.nextInt();
    sc.close();


    //return if number is negative
    if(num < 0) return;

    // Number is positive
    if(num%3 == 0 || num%5 == 0){
      System.out.println("Divisible by 3 or 5");
    }
    else{
      System.out.println("Not Divisible by 3 or 5");
    }
  }
}
