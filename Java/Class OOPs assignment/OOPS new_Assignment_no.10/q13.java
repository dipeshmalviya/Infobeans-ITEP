/*13) Create a class to calculate Area of circle with one data member to store the radius and another to store area value. Create method members
init - to input radius from user
calc - to calculate area
display- to display area
 */
class Area{
    private int radius;
    private float area;

    public Area(){}

    public Area(int radius){
        this.radius = radius;
    }

    public void inti(int radius){
        this.radius = radius;
    }

    public void calc(){
        this.area = 3.14f * radius * radius;
    }

    public void display(){
        System.out.println("The area of circle with radius " + radius + " is " + area);
    }

}

class Test{
    public static void main(String args[]){
        Area ar = new Area(3);
        ar.inti(4);
        ar.calc();
        ar.display();
    }
}