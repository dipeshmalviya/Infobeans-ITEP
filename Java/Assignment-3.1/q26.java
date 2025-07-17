/* 26. Write a Java program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer.          Calculate percentage and grade according to following: 
	Percentage >= 90% : Grade A 
	Percentage >= 80% : Grade B 
	Percentage >= 70% : Grade C 
	Percentage >= 60% : Grade D 
	Percentage >= 40% : Grade E 
	Percentage < 40% : Grade F
*/
import java.util.Scanner;
class Percentage{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Chemistry marks: ");
        int chem = sc.nextInt();

        System.out.println("enter the Biology marks: ");
        int bio = sc.nextInt();

        System.out.println("enter the Mathematics marks: ");
        int maths = sc.nextInt();

        System.out.println("enter the computer marks: ");
        int comp = sc.nextInt();

        int total = chem +bio+maths+comp;
        System.out.println("total obtained marks: "+ total);
        double percentage =  (total / 400)*100;
        System.out.println("percentage: "+ percentage);
        if (percentage >= 90){
            System.out.println("Grade A");
        }
        else if(percentage >= 80){
             System.out.println("Grade B");
        }
        else if(percentage >= 70){
             System.out.println("Grade C");
        }
        else if(percentage >= 60){
             System.out.println("Grade D");
        }
        else if(percentage >= 40){
             System.out.println("Grade E");
        }
        else if(percentage < 40){
             System.out.println("Grade F");
        } else
         System.out.println("no Grade");

        
    }
}