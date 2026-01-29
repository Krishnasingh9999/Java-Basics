public class CharDataType {
  public static void main(String[] args) {
    char ch = 'A';
    System.out.print(ch + ": ");

    int x = ch; // Implicit typecasting
    System.out.println(x); //65

    char letter = 'a';
    System.out.print(letter + ": ");

    int y = letter; // Implicit typecasting
    System.out.println(y); //97

    char num = '0';
    System.out.print(num + ": ");

    int b = num; // Implicit typecasting
    System.out.println(b); //48


    //Integer to Character
    int a = 65;
    char alphabet = (char) a; // Explicit typecasting
    System.out.println(alphabet); // A

    char bye = 'b';
    System.out.println(bye + 0); // char + int -> int

    System.out.println(bye + bye); // same (char + char) -> sum of there ASCII value which is int

    System.out.println(bye * bye); // same (char * char) -> multiply of there ASCII value which is int
  }
}
