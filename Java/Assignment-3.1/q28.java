/* 28. Write a C program to input electricity unit charges and calculate total electricity bill according to the given condition: For first 50 units Rs. 0.50/unit For next 100 units Rs. 0.75/unit For next 100 units Rs. 1.20/unit For unit above 250 Rs. 1.50/unit An additional surcharge of 20% is added to the bill. 
*/


import java.util.Scanner;
class Bill{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the electricity unit");
        double unit=sc.nextDouble();

        if(unit<=50){
            double unit1=unit*0.50;
            double charge1=(unit1*20)/100;
            double total_bill1=unit1+charge1;
            System.out.println("Electricity unit :"+total_bill1);
        }
        else if(unit<=100){
              double unit2=unit*0.75;
            double charge2=(unit2*20)/100;
            double total_bill2=unit2+charge2;
            System.out.println("Electricity unit :"+total_bill2);
        }
        else if(unit<=250){
              double unit3=unit*1.20;
            double charge3=(unit3*20)/100;
            double total_bill3=unit3+charge3;

            System.out.println("Electricity unit :"+total_bill3);
        }
        else if(unit>250){
              double unit4=unit*1.50;
            double charge4=(unit4*20)/100;
            double total_bill4=unit4+charge4;

            System.out.println("Electricity unit :"+total_bill4);
        }
        else{
            System.out.println("Invalid unit");
        }
    }
}