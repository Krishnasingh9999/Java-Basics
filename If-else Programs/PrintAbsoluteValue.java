import java.util.Scanner;
public class PrintAbsoluteValue {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Please enter the number: ");
    int num = sc.nextInt();
    sc.close();

    //  System.out.println(Math.abs(num));

    // if(num >= 0){
    //   System.out.println(num);
    // }
    // else{
    //   System.out.println(-(num));
    // }

    if(num < 0) num = -num;
    System.out.println(num);
  }
}