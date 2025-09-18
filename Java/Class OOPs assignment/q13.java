/*13. Write a Java program to create a class called 
"Inventory" with a collection of products and methods to add 
and remove products, and to check for low inventory.

 */

import java.util.ArrayList;
class Inventory{
    private ArrayList<String> product = new ArrayList<String>();
    
    public void addProduct(String p1){
        System.out.println("product added : "+p1);
       product.add(p1);
    }
    public void removeProduct(String p1){
        System.out.println("product removed : "+p1);
        product.remove(p1);
    }
   public void checkForlowInventory(){
       if(product.size()>10)
         System.out.println("Inventory has sufficient products");
        else
         System.out.println("Inventory has insufficient products");

   }
   
   

}

class TestMain{
    public static void main(String args[]){
       

        Inventory inventory = new Inventory(); // Inventory
        inventory.addProduct("item1");
        inventory.addProduct("obj2");
        inventory.addProduct("obj3");
        inventory.removeProduct("obj1");
        System.out.println("----------------------------------------------------");
        
        inventory.checkForlowInventory();
       

    }
}