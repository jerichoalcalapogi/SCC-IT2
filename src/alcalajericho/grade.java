
package alcalajericho;
import java.util.Scanner;

public class grade {
  public void genGrade() {
    Scanner sc = new Scanner(System.in);
    grades[] gr = new grades[100];

    System.out.print("Enter no. of Students: ");
    int nums = sc.nextInt();

    for (int i = 0; i < nums; i++) {
      System.out.println("Enter details of student " + (i + 1) + ":");
      System.out.print("ID: ");
      int id = sc.nextInt();
      System.out.print("Name: ");
      String name = sc.next();

      System.out.print("Prelim: ");
      double pr = sc.nextDouble();
      System.out.print("Midterm: ");
      double md = sc.nextDouble();
      System.out.print("Prefinal: ");
      double pf = sc.nextDouble();
      System.out.print("Final: ");
      double fn = sc.nextDouble();

      gr[i] = new grades();
      gr[i].addGrades(id, name, pr, md, pf, fn);
    }

    for (int i = 0; i < nums; i++) {
      gr[i].viewGrades();
    }
  }
}
