/*19. W.A.P to check whether the traingle is equilateral, scalene, or isosceles. Hint: - Isosceles triangle: In geometry, an isosceles triangle is a triangle that has two sides of equal length. Equilateral triangle: In geometry, an equilateral triangle is a triangle in which all three sides are equal. Scalene triangle: A scalene triangle is a triangle that has three unequal sides. 
*/
import java.util.Scanner;
class Triangles{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first side: ");
        int side1 = sc.nextInt();
        
        System.out.println("enter second side: ");
        int side2 = sc.nextInt();

        System.out.println("enter third side: ");
        int side3 = sc.nextInt();

        if(side1 == side2 && side2 == side3){
            System.out.println("triangle is isosceles");
        }
        else if( side1 == side2 || side2 == side3 || side3==side1){
            System.out.println("triangle is equilateral triangle");

        }
        else 
        System.out.println("Triangle is Scalene");

    }
}