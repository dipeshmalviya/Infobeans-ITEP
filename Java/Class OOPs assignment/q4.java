/* 4. Write a Java program to create a class called 
"Circle" with a radius attribute. You can access and
 modify this attribute. Calculate the area and circumference
  of the circle.
 */
import java.util.Scanner;
class Circle{
    private float radius;

    public Circle(){
       radius=0;
    }
    public Circle(float radius){
        this.radius=radius;
    }
    public void setRadius(float radius){
        this.radius=radius;
    }
    public float calcArea(float radius){
        return(3.14f*(radius*radius));
    }
    public float clacCircumference(float radius){
        return (2*3.14f*radius);
    }
}
class TestMain{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.println("we are calculate area of Circle and Circumference of Circle ");

        System.out.print("Enter radius of the Circle : ");
        float radius=sc.nextFloat();

        //creating object od Circle class
        Circle c1 = new Circle(radius);//value intilize by constructor
         System.out.print("you mistakly enter wrong radius please enter updated radius : ");
        radius =sc.nextFloat();
         c1.setRadius(radius);//value updated by setter function
        float Area=c1.calcArea(radius);
        float circumference=c1.clacCircumference(radius);
        System.out.print("Area of Circle is :"+Area +"\n");
        System.out.print("Circumference of Circle is :"+circumference);

    }
}