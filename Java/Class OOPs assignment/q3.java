/* 3. Write a Java program to create a class called 
"Rectangle" with width and height attributes. Calculate 
the area and perimeter of the rectangle.
 */
import java.util.Scanner;
class Rectangle{
    private int width;
    private int height;

    public Rectangle(){
        width=0;
        height=0;
    }
    public Rectangle(int width,int height){
        this.width=width;
        this.height=height;
    }
    public int calcArea(int width,int height){
        return(width*height);
    }
    public float clacPerimeter(int width,int height){
        return((width+height)/2f);
    }
}
class TestMain{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.println("we are calculate area of rectangle and perimeter of rectangle ");

        System.out.print("Enter width of the rectangle : ");
        int width=sc.nextInt();
        System.out.print("Enter height of the rectangle : ");
        int height=sc.nextInt();

        //creating object od Rectangle class
        Rectangle r1 = new Rectangle(width,height);
        int Area=r1.calcArea(width, height);
        float perimeter=r1.clacPerimeter(width, height);
        System.out.print("Area of Rectangle is :"+Area +"\n");
        System.out.print("Perimeter of Rectangle is :"+perimeter);

    }
}