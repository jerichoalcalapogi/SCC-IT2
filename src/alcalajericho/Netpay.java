
package alcalajericho;

import java.util.Scanner;

public class Netpay {
  public void getPay() {
    Scanner input = new Scanner(System.in);
    String name;
    int by;
    int rph, thw, td;
    float gross;
    float pay;

    System.out.print("Enter  your name:");
    name = input.nextLine();
    System.out.print("Enter age:");
    by = input.nextInt();
    System.out.print("Enter your Rate per hour:");
    rph = input.nextInt();
    System.out.print("Enter total hours worked:");
    thw = input.nextInt();
    System.out.print("Enter total deduction:");
    td = input.nextInt();
    System.out.println("--------------------");
    System.out.println("SLIP DETAILS");
    System.out.println("--------------------");
    System.out.println("Date: August 14, 2024");
    System.out.println("Name:" + name);
    System.out.println("Age:" + by);
    System.out.printf("Total Gross:Php%.2f", (float) (rph * thw));
    System.out.println("\nDeduction:" + td);
    System.out.println("--------------------");
    System.out.printf("Net Pay:Php%.2f", (float) ((rph * thw) - td));
  }
}
