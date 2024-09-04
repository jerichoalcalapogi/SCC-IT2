
package alcalajericho;

import java.util.Scanner;


public class products {
     public void inputProductDetails() {
        Scanner in = new Scanner(System.in);
          product[] pr = new product[100];
           System.out.print("Enter no. of products: ");
        int np = in.nextInt();


        for(int i=0; i<np; i++){
            
        System.out.print("Enter Product ID: ");
        int id = in.nextInt();

        in.nextLine(); 

        System.out.print("Enter Product Name: ");
        String name = in.nextLine();

        System.out.print("Enter Product Price: ");
        int price = in.nextInt();

        System.out.print("Enter Number of Products in Stock: ");
        int stock = in.nextInt();

        System.out.print("Enter Number of Products Sold: ");
        int sold = in.nextInt();
         
     pr[i]= new product();
      pr[i].addProduct(id,name,price,sold,stock);
        }
         System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s\n","Product ID","Name","Price","Stock","Status","Total expected profit");   
      for(int i=0; i<np; i++){
          
          pr[i].viewProduct();
        }
     }
}
