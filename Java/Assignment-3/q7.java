import java.util.Scanner;
class Eligible{
public static void main(String []args){
 Scanner sc=new Scanner(System.in);

 System.out.println ("Enter a number of class held:");
 int held=sc.nextInt();
 System.out.println ("Enter a number of class attend:");
 int atten=sc.nextInt();
float totalAttendence=((float)atten/held)*100f;

 System.out.println ("Total percentage of the class attendence:"+totalAttendence);

if(totalAttendence>=75)
  System.out.println ("Eligible");

else 
 System.out.println ("not eligible");

}
}




