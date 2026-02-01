import java.util.*;

public class IsDivisible {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Please enter the number: ");
    int num = sc.nextInt();

    if(num%5 == 0 && num%3 == 0){
      System.out.println("Divisible by 5 & 3");
    }
    else if(num%3 == 0){
      System.out.println("Divisible by 3");
    }
    else if(num%5 == 0){
      System.out.println("Divisible by 5");
    }
    else{
      System.out.println("Not Divisible by 5 or 3");
    }

    sc.close();
  }
}
