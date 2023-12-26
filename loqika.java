import java.util.Scanner;

public class loqika {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int a = in.nextInt();

    if (a > 2 && a < 9) {
      System.out.println("Number greater than 2 and less than 9");
    } else {
      System.out.println("The number was entered incorrectly");
    }

  }
}
