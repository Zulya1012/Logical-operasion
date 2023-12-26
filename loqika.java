import java.util.Scanner;

public class loqika {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    System.out.println("Vvedite chislo: ");
    int a = in.nextInt();

    if (a > 2 && a < 9) {
      System.out.println("chislo bolshe 2 i menshe 9");
    } else {
      System.out.println("Chislo ne pravilno vvedeno");
    }

  }
}
