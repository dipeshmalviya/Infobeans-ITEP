import java.util.Scanner;
class Time{
    private int hour;
    private int minute;
    private int second;
    public Time(int hour, int minute,int second){
        this.hour = hour;
        this.minute = minute;
        this.second=second;
    }
    
    public Time(){}

    public Time add(Time t){
        Time temp = new Time();
        temp.hour = this.hour + t.hour;
        temp.minute = this.minute + t.minute;
        temp.second=this.second + t.second;
         if(temp.hour>=24){
      System.out.print("total time is greater than 1 day or 24 hours :\n");  
       return temp;       
    }
        else{
      if(temp.second >=60){
            temp.minute++;
            temp.second %= 60;  
        }
        if(temp.minute>=60){
            temp.hour++;
          temp.minute %= 60; 
        }   
    
    }     
         return temp;
    }
    public void add(Time t1,Time t2){
        Time temp = new Time();
        temp.hour = t1.hour + t2.hour;
        temp.minute = t1.minute + t2.minute;
        temp.second=t1.second + t2.second;
       
        if(temp.hour>=24){
      System.out.print("total time is greater than 1 day or 24 hours :\n");  
         
    }
        else{
      if(temp.second >=60){
            temp.minute++;
            temp.second %= 60;  
        }
        if(temp.minute>=60){
            temp.hour++;
          temp.minute %= 60; 
        }   

    }      
       
    }
    public void display(){
        System.out.println(hour+" hours "+minute+" minute "+second +" second ");
    } 
}
class TestMain{
    public static void main(String args[]){
        System.out.println("Enter time in this way (2 hours,40 minutes ,33 seconds)");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first time hour");
        int hour=sc.nextInt();
        // if(hour>24){
        //     System.out.println("Greater than 24 hour please enter less than 24");
        // }
         System.out.println("Enter first time minute");
        int minute=sc.nextInt();
         System.out.println("Enter first time second");
        int second=sc.nextInt();       

        System.out.println("Enter 2nd time hour");
        int hour2=sc.nextInt();
        // if(hour2>24){
        //     System.out.println("Greater than 24 hour please enter less than 24");
        // }
        
         System.out.println("Enter 2nd time minute");
        int minute2=sc.nextInt();
         System.out.println("Enter 2nd time second");
        int second2=sc.nextInt();       

        Time t1 = new Time(hour,minute,second);
        Time t2 = new Time(hour2,minute2,second2);
        t1.display();
        t2.display();
       
        //  Time result =  t1.add(t2);
        // if(hour>24){}
        // else
        // result.display();
        
        //without returning
        Time t3 = new Time();
        t3.add(t1,t2);
        if(hour>24)
        System.out.println("Total time is greater than 1 day or 24 hours");
        else
        t3.display();

    }
}
   
    
    
    
    
    
    
    
    
    
    
/*    
 public void add(Distance d1, Distance d2){
        this.km = d1.km + d2.km;
        this.meter = d1.meter + d2.meter;
        if(this.meter >=1000){
            this.km++;
            this.meter %= 1000;
        }
    }
        */ 