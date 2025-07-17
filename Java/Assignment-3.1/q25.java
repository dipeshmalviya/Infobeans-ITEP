/*25. Write a Java program to calculate profit or loss.  */
import java.util.Scanner;
class ProfitLoss{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a selling price: ");
        int sellingPrice = sc.nextInt();

        System.out.println("enter a cost price: ");
        int costPrice =  sc.nextInt();
         int profit = sellingPrice - costPrice;
         System.out.println("profit is: "+ profit);

         int loss = costPrice - sellingPrice;
         System.out.println("loss is: "+loss);
         if(sellingPrice < costPrice){
         System.out.println("it is loss");
         }
         else
         System.out.println("it is profit");
    }
}