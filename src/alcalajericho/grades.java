
package alcalajericho;
import java.util.Scanner;
public class grades {
      int id;
    String name;
    double p,m,pf,f;
    public void addGrades(int sid, String name, double prl, double mid, double prf, double fnl){
        
        this.name = name;
        this.id=sid;
        this.p =prl;
        this.m =mid;
        this.pf=prf;
        this.f =fnl;
    }
    
    public void viewGrades() {
        double average= (this.p + this.m + this.pf + this.f) / 4;
        String remarks=(average > 3.0) ? "Failed": "Passed";
        
        System.out.printf("%-10d %-10s 0.20 %-10.2f %-10.2f %-10.2f %-10.2f %-10.2f %-10s\n",this.id, this.name, this.p, this.m, this.pf, this.f, average, remarks);
        
}
}