
package alcalajericho;
import java.util.Scanner;

public class product {
     String name, status;
   int pid, stks, price, tep;
   
   public void addProduct(int pid, String nm, int pd, int pr, int stk){
       this.name = nm;
       this.pid = pd;
       this.price = pr;
       this.stks = stk;
     
       
   }
   
   public void viewProduct(){
       double totalExpectedprofit = this.price * this.stks;
       String Status = (this.stks < 0) ? "Available" : "Out of Stock";
       
       
       System.out.printf("%-10d %-10s %-10d %-10d %-10s %-10.2f\n", this.pid, this.name, this.price, this.stks, Status, totalExpectedprofit);
   }
}
