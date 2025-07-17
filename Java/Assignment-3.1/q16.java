/*16. W.A.P to convert temperature from Fahrenheit to Celsius and Celsius to Fahrenheit. For given problem you have to take choice from user. If user enter choice ‘c’ or ‘C’ then convert Fahrenheit to Celsius. If user enter choice ‘f’ or ‘F’ then convert Celsius to Fahrenheit. */


import java.util.Scanner;
class Convert{
public static void main(String []args){

Scanner sc=new Scanner (System.in);
System.out.println("Enter  character:");
char ch=sc.next().charAt(0);



if(ch=='c' || ch=='C'){
  
System.out.println("Enter celecious:");
 float c=sc.nextFloat();

float f=c*(9/5f)+32;
     System.out.println("convert celecious ferihneit:"+f);

}
else if(ch=='f' || ch=='F'){

  
System.out.println("Enter ferihneit:");
 float c=sc.nextFloat();
 
float f=c*(1.8f*c)+32;
     System.out.println("convert  ferihneit  to t celecious:"+c);

}
else{
System.out.println("Invalid  character:");

}




}
}