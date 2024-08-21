
package alcalajericho;


public class main {

   
    public static void main(String[] args) {
   grades gr = new grades();
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s\n"
               ,"Student ID", "Name","Prelim","Midterm","Prefinal","Finals","Average","Remarks");
      
       gr.addGrades(1001, "Mike", 1.0, 1.0, 1.0, 1.0);
       gr.viewGrades(1001);        
       grades gr1 = new grades();
       gr.addGrades(1002, "John", 2.0, 1.0, 1.0, 1.0);       
       gr.viewGrades(1002);
      
       
    }
    
}
