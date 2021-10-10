import java.util.Scanner;
import java.text.DecimalFormat;

public class CurrencyConverter {

  public static void main(String[] args) {

    // Variables
    double amount;
    double curr;
    double euro;
    double usDollar;
    double yen;
    double britishPound;
    double canadianDollar;
    double ausDollar;

    DecimalFormat f = new DecimalFormat("##.##");

    Scanner input = new Scanner(System.in);

    System.out.println("Welcome to Currency Converter");
    System.out.println("What currency would you like to convert?");
    System.out.println(" ");
    System.out.println("Please select from the list below on the available currency:");
    System.out.println(" ");
    System.out.println("1. Euro");
    System.out.println("2. US Dollar");
    System.out.println("3. Japanese Yen");
    System.out.println("4. British Pound");
    System.out.println("5. Canadian Dollar");
    System.out.println("6. Australia Dollar");
    System.out.println("");
    curr = input.nextInt();

    System.out.println("Please enter the amount you would like to convert.");
    amount = input.nextDouble();

    // Euro conversion
    if (curr == 1) {
      usDollar = amount * 1.16;
      System.out.println(amount + " Euro is " + f.format(usDollar) + " US Dollar.");

      yen = amount * 128.82;
      System.out.println(amount + " Euro is " + f.format(yen) + " Japanese Yen.");

      britishPound = amount * 0.86;
      System.out.println(amount + " Euro is " + f.format(britishPound) + " British Pound.");

      canadianDollar = amount * 1.47;
      System.out.println(amount + " Euro is " + f.format(canadianDollar) + " Canadian Dollar.");

      ausDollar = amount * 1.60;
      System.out.println(amount + " Euro is " + f.format(ausDollar) + " Australian Dollar.");
    }

    // US Dollar conversion
    else if (curr == 2) {
      euro = amount * 0.86;
      System.out.println(amount + " US Dollar is " + f.format(euro) + " Euro.");

      yen = amount * 111.08;
      System.out.println(amount + " US Dollar is " + f.format(yen) + " Japanese Yen.");

      britishPound = amount * 0.74;
      System.out.println(amount + " US Dollar is " + f.format(britishPound) + " British Pound.");

      canadianDollar = amount * 1.26;
      System.out.println(amount + " US Dollar is " + f.format(canadianDollar) + " Canadian Dollar.");

      ausDollar = amount * 1.38;
      System.out.println(amount + " US Dollar is " + f.format(ausDollar) + " Australian Dollar.");
    }

    // Japanese Yen conversion
    else if (curr == 3) {
      euro = amount * 0.0078;
      System.out.println(amount + " Japanese Yen is " + f.format(euro) + " Euro.");

      usDollar = amount * 0.0090;
      System.out.println(amount + " Japanese Yen is " + f.format(usDollar) + " US Dollar.");

      britishPound = amount * 0.0066;
      System.out.println(amount + " Japanese Yen is " + f.format(britishPound) + " British Pound.");

      canadianDollar = amount * 1.26;
      System.out.println(amount + " Japanese Yen is " + f.format(canadianDollar) + " Canadian Dollar.");

      ausDollar = amount * 1.38;
      System.out.println(amount + " Japanese Yen is " + f.format(ausDollar) + " Australian Dollar.");
    }

    // British Pound conversion
    else if (curr == 4) {
      euro = amount * 1.17;
      System.out.println(amount + " British Pound is " + f.format(euro) + " Euro.");

      usDollar = amount * 1.36;
      System.out.println(amount + " British Pound is " + f.format(usDollar) + " US Dollar.");

      yen = amount * 151.92;
      System.out.println(amount + " British Pound is " + f.format(yen) + " Japanese Yen.");

      canadianDollar = amount * 1.71;
      System.out.println(amount + " British Pound is " + f.format(canadianDollar) + " Canadian Dollar.");

      ausDollar = amount * 1.87;
      System.out.println(amount + " British Pound is " + f.format(ausDollar) + " Australian Dollar.");
    }

    // Canadian Dollar conversion
    else if (curr == 5) {
      euro = amount * 0.69;
      System.out.println(amount + " Canadian Dollar is " + f.format(euro) + " Euro.");

      usDollar = amount * 0.79;
      System.out.println(amount + " Canadian Dollar is " + f.format(usDollar) + " US Dollar.");

      yen = amount * 88.63;
      System.out.println(amount + " Canadian Dollar is " + f.format(yen) + " Japanese Yen.");

      britishPound = amount * 0.58;
      System.out.println(amount + " Canadian Dollar is " + f.format(britishPound) + " British Pound.");

      ausDollar = amount * 1.09;
      System.out.println(amount + " Canadian Dollar is " + f.format(ausDollar) + " Australian Dollar.");
    }

    // Australian Dollar conversion
    else if (curr == 6) {
      euro = amount * 0.63;
      System.out.println(amount + " Australian Dollar is " + f.format(euro) + " Euro.");

      usDollar = amount * 0.73;
      System.out.println(amount + " Canadian Dollar is " + f.format(usDollar) + " US Dollar.");

      yen = amount * 82.05;
      System.out.println(amount + " Canadian Dollar is " + f.format(yen) + " Japanese Yen.");

      britishPound = amount * 0.54;
      System.out.println(amount + " Canadian Dollar is " + f.format(britishPound) + " British Pound.");

      canadianDollar = amount * 0.91;
      System.out.println(amount + " British Pound is " + f.format(canadianDollar) + " Canadian Dollar.");
    }

    else {
      System.out.println("Invalid input");
    }
    System.out.println(" ");
    System.out.println("Thank you for using Currency Converter.");
  }
}