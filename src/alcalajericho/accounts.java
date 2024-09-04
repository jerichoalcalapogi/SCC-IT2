
package alcalajericho;
import java.util.Arrays;
import java.util.Scanner;

public class accounts {
     public void inputAcoounts(){
         Scanner in = new Scanner(System.in);
         
        System.out.print("Enter no. accounts: ");
        int nums = in.nextInt();

        for(int i=0; i < nums; i++) {
            System.out.println("Enter details of account " + (i+1) + ":");
            System.out.print("ID: ");
            int id = in.nextInt();
            System.out.print("Name: ");
            String name = in.next();

            System.out.print("email: ");
            String em = in.next();
            System.out.print("Username: ");
            String user = in.next();
            System.out.print("Password: ");
            double pass = in.nextFloat();
          String password;
            while (true) {
                System.out.print("Password: ");
                password = in.nextLine();

                if (isPasswordValid(password)) {
                    break;
                } else {
                    String MIN_PASSWORD_LENGTH = null;
                    System.out.println("Password must be at least " + MIN_PASSWORD_LENGTH + " characters long and contain at least one special character.");
                }
            }
     
         
     }
         
         
         
     }         

    private boolean isPasswordValid(String password) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

}