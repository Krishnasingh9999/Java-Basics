import java.util.*;

public class IsFourDigitNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Please enter the number: ");
    int num = sc.nextInt();

    if(num > 999 && num <10000){
      System.out.println("The number is four-digit number");
    }
    else{
      System.out.println("Not four-digit number");
    }

    sc.close();
  }
}
