/* 21. Java program to check whether the triangle is valid or not if angles are given. Hint:- The angle property of the triangle says that the sum of all three angles should be equal to 180. 
*/
import java.util.Scanner;
class Triangle{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first angle: ");
        double angle1 = sc.nextDouble();
        System.out.println("enter the second angle: ");
        double angle2 = sc.nextDouble();
        System.out.println("enter the thirs angle: ");
        double angle3= sc.nextDouble();
        double result = angle1 + angle2 + angle3;
        System.out.println("total sum: "+ result);
        if( result == 180){
            System.out.println("it is valid triangle");
        }
        else
        System.out.println("it is not valid triangle");
    }
}