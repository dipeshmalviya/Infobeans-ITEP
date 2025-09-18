/*  12. Write a Java program to create a class called 
"Airplane" with a flight number, destination, and departure 
time attributes, and methods to check flight status and delay.
 */
//import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class
import java.util.Scanner;
class Airplane{
    Scanner sc= new Scanner(System.in);
    private String flightNumber;
    private String destination;
   // private DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"); 
   private int departure_time;
   private boolean status;

   public Airplane(){}
   public Airplane(String flightNumber,String destination,int departure_time){
   this.flightNumber = flightNumber;
   this.destination = destination;
   this.departure_time=departure_time;
   

}
    public void flightStatus(){
            if(status){
                 System.out.println("status On-Time");
                 status=false;
           }
            else{
                 delay();
                 status=true;
            }
             
            
            
    }
    public void delay(){
    System.out.println("Enter time(only hour entry) for check fight is avilable or not");
       int actual_time = sc.nextInt();
        if(departure_time==actual_time)
            System.out.println("status On-bording");
        else if(departure_time>actual_time)
           System.out.println("status On-time");
           else if(departure_time<actual_time)
             if(departure_time+10>actual_time)
                 System.out.println("status In-air");
                else
                  System.out.println("status Sechduled");

    else
                      System.out.println("status cancelled");


    }

}
class TestMain{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the fightnumber");
        String fightnumber=sc.nextLine();
        System.out.println("Enter destination");
        String destination=sc.nextLine();
        System.out.println("Enter Departure time");
        int departure_time=sc.nextInt();        

        Airplane indigo = new Airplane(fightnumber,destination,departure_time);
        indigo.flightStatus();
        //indigo.flightStatus();
        // indigo.delay();

        
        
    }
}
