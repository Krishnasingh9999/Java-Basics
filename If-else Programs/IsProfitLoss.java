import java.util.*;

public class IsProfitLoss {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Please enter the cost price: ");
    int cp = sc.nextInt();

    System.out.print("Please enter the selling price: ");
    int sp = sc.nextInt();

    int profit= sp - cp;
    int profitPercent = (profit * 100)/cp;

    int loss = cp - sp;
    int lossPercent = (loss * 100)/cp;

    // // Using only if statements
    // if(sp > cp){
    //   System.out.println("Seller has profit: " + profit);
    //   System.out.println("Profit % is: " + profitPercent + "%");

    // }
    // if(cp == sp){
    //   System.out.println("No profit, No loss");
    // }
    // if(sp < cp){
    //   System.out.println("Seller has loss: " + loss);
    //   System.out.println("Loss % is: " + lossPercent + "%");
    // }

    // By using else if ladder
    if(sp > cp){
      System.out.println("Seller has profit: " + profit);
      System.out.println("Profit % is: " + profitPercent + "%");

    }
    else if(cp == sp){
      System.out.println("No profit, No loss");
    }
    else{
      System.out.println("Seller has loss: " + loss);
      System.out.println("Loss % is: " + lossPercent + "%");
    }

    sc.close();

  }
}
