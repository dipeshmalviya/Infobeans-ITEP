/* 8. Write a Java program to create class called 
"TrafficLight" with attributes for color and duration, 
and methanods to chge the color and check for red or green.
 */
import java.util.Scanner;
class TrafficLight{
    private String color;
    private String duration;
    public TrafficLight(){
        this.color="red";
        this.duration="30s";
         System.out.println("By default signal color is:"+this.color);      
    }
    public TrafficLight(String color,String duration){
        // this.color=color;
        // this.duration=duration;
    }
    public void changeColor(String color){
      this.color=color;
      System.out.println("After signal time changing the color of signal or traffic light");

    }
    public boolean checkColor(){
        if(color.equals("red")||(color.equals("green")))
          return true;
          return false;    
}
}
class TestMain{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        TrafficLight t1=new TrafficLight();
       // TrafficLight t1 = new TrafficLight("yellow","5 minutes");
       System.out.println("Enter a color which show in traffic (change the color)light signal");
       String color=sc.nextLine();
        System.out.println("Enter duration of a signal in second");
       String duration=sc.nextLine();

        t1.changeColor(color);
        boolean s=t1.checkColor();
        System.out.println("");
    }
}
