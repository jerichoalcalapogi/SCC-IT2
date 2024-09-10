package alcalajericho;

import java.util.Scanner;

public class main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String c;
    do {
      System.out.print(
          "Menu:\n1.Grading System\n2.Product\n3.NetPay\n4.Salary\n5.Account "
          + "Registration\nEnter your choice: ");
      int choice = in.nextInt();
      switch (choice) {
        case 1:
          grade gr = new grade();
          gr.genGrade();
          break;
        case 2:
          products pr = new products();
          pr.inputProductDetails();
          break;
        case 3:
          Netpay np = new Netpay();
          np.getPay();
          break;
        case 4:
          Salary sr = new Salary();
          sr.getSalary();
          break;
        case 5:
          account ac = new account();
          ac.getAccounts();
          break;
      }
      System.out.print("Do you want to select another system? (Y/N): ");
      c = in.next();
    } while (c.equals("Y") || c.equals("y"));
    System.out.println("THANK YOU FOR USING THIS SYSTEM!");
  }
}